package l16_IOTextFile.DocFileCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReaderApplication {

    private String removeQuotes(String value) {
        if (value != null && value.length() >= 2 && value.startsWith("\"") && value.endsWith("\"")) {
            return value.substring(1, value.length() - 1);
        }
        return value;
    }

    public List<Country> readCountriesFromCsv(String filePath) {
        List<Country> countries = new ArrayList<>();
        BufferedReader bufferedReader = null;
        String currentLine = "";
        int lineNumber = 0;

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException("File khong tim thay tai duong dan da cung cap.");
            }

            bufferedReader = new BufferedReader(new FileReader(file));

            while ((currentLine = bufferedReader.readLine()) != null) {
                lineNumber++;
                if (currentLine.trim().isEmpty()) {
                    continue;
                }

                String[] parts = currentLine.split(",");

                if (parts.length >= 3) {
                    try {
                        int id = Integer.parseInt(removeQuotes(parts[0].trim()));
                        String code = removeQuotes(parts[1].trim());
                        String name = removeQuotes(parts[2].trim());

                        countries.add(new Country(id, code, name));
                    } catch (NumberFormatException e) {
                        System.err.println("Loi: ID khong phai la so nguyen hop le tai dong " + lineNumber + ": ["
                                + currentLine + "]. Dong nay se duoc bo qua.");
                    }
                } else {
                    System.err.println("Loi: Dong khong du so luong cot du lieu yeu cau tai dong " + lineNumber + ": ["
                            + currentLine + "]. Dong nay se duoc bo qua.");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Loi: File khong duoc tim thay tai duong dan: " + filePath);
        } catch (IOException e) {
            System.err.println("Loi: Da xay ra su co trong qua trinh doc file: " + e.getMessage());
        } catch (Exception e) { 
            System.err.println("Loi khong mong doi da xay ra: " + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Loi: Khong the dong file reader: " + e.getMessage());
                }
            }
        }
        return countries;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap duong dan den file CSV (vi du: countries.csv): ");
        String filePath = scanner.nextLine();

        CsvReaderApplication csvReader = new CsvReaderApplication();
        List<Country> countryList = csvReader.readCountriesFromCsv(filePath);

        if (countryList.isEmpty()) {
            System.out.println("Khong co du lieu quoc gia nao duoc doc tu file hoac file trong/loi.");
        } else {
            System.out.println("Danh sach cac quoc gia da doc:");
            for (Country country : countryList) {
                System.out.println(country.toString()); 
            }
        }
        scanner.close();
    }
}
