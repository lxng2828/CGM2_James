package l17_BinaryFileVaSerialization.CopyCacFileCoDungLuongLon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileCopy {

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);

            byte[] buffer = new byte[8192];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    System.err.println("Loi khi dong InputStream: " + e.getMessage());
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    System.err.println("Loi khi dong OutputStream: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhap duong dan file nguon:");
        String sourcePath = in.nextLine();

        System.out.println("Nhap duong dan file dich (bao gom ca ten file moi):");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        if (!sourceFile.exists()) {
            System.out.println("Loi: File nguon khong ton tai.");
            in.close();
            return;
        }

        File parentDir = destFile.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            if (!parentDir.mkdirs()) {
                System.out.println("Loi: Khong the tao thu muc dich.");
                in.close();
                return;
            }
        }

        try {
            long startTime, endTime;

            System.out.println("Dang sao chep su dung Files.copy (Java 7+)...");
            startTime = System.currentTimeMillis();
            copyFileUsingJava7Files(sourceFile, destFile);
            endTime = System.currentTimeMillis();
            System.out.println("Sao chep hoan tat bang Files.copy. Thoi gian: " + (endTime - startTime) + "ms");

        } catch (IOException ioe) {
            System.out.println("Khong the sao chep tap tin nay.");
            System.out.println("Chi tiet loi: " + ioe.getMessage());
        } catch (SecurityException se) {
            System.out.println("Loi bao mat: Khong co quyen truy cap hoac ghi file.");
            System.out.println("Chi tiet loi: " + se.getMessage());
        } finally {
            in.close();
        }
    }
}
