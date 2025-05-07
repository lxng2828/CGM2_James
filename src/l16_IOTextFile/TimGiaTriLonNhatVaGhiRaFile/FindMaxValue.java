package l16_IOTextFile.TimGiaTriLonNhatVaGhiRaFile;

import java.util.List;
import java.util.Scanner;

public class FindMaxValue {

    public static int findMax(List<Integer> numbers) {


        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) { // Bat dau tu 1 vi max da la phan tu dau tien
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap duong dan den file chua cac so nguyen (vi du: numbers.txt):");
        String inputFilePath = scanner.nextLine();

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(inputFilePath);

        if (numbers.isEmpty()) {

            System.out.println("Khong co du lieu de xu ly hoac da co loi xay ra khi doc file.");
        } else {
            int maxValue = findMax(numbers);

            String outputFilePath = "result.txt";
            readAndWriteFile.writeFile(outputFilePath, maxValue);
            System.out.println("Da tim va ghi gia tri lon nhat vao file: " + outputFilePath);
        }

        scanner.close();
    }
}