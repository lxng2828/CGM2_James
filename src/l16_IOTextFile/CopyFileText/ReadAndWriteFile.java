package l16_IOTextFile.CopyFileText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException("Tap tin khong tim thay.");
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String trimmedLine = line.trim();
                if (!trimmedLine.isEmpty()) {
                    String[] parts = trimmedLine.split("\\s+");
                    for (String part : parts) {
                        if (!part.isEmpty()) {
                            numbers.add(Integer.parseInt(part));
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("File khong ton tai hoac noi dung co loi!");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Da xay ra loi khi dong file reader: " + e.getMessage());
                }
            }
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter writer = new FileWriter(filePath, false);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Gia tri lon nhat la: " + max);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
