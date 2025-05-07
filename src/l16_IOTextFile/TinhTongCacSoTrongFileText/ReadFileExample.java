package l16_IOTextFile.TinhTongCacSoTrongFileText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String filePath) {
        BufferedReader br = null;
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }

            if (br != null) {
                br.close();
            }

            System.out.println("Tong = " + sum);

        } catch (Exception e) {
            // Hien thi thong bao loi chung theo yeu cau
            System.err.println("File khong ton tai hoac noi dung co loi!");
        }

    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);

        scanner.close();
    }
}