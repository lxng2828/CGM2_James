package l2_VongLapTrongJava;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. In hinh chu nhat");
            System.out.println("2. In tam giac vuong (4 goc)");
            System.out.println("3. In tam giac can");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle(scanner);
                    break;
                case 2:
                    printSquareTriangle(scanner);
                    break;
                case 3:
                    printIsoscelesTriangle(scanner);
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Thu lai!");
            }
        } while (choice != 0);
    }

    public static void printRectangle(Scanner scanner) {
        System.out.print("Nhap chieu cao: ");
        int height = scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        int width = scanner.nextInt();

        System.out.println("\nHinh chu nhat:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle(Scanner scanner) {
        System.out.println("\nChon vi tri goc:");
        System.out.println("1. Goc duoi trai");
        System.out.println("2. Goc tren trai");
        System.out.println("3. Goc duoi phai");
        System.out.println("4. Goc tren phai");
        System.out.print("Nhap lua chon cua ban: ");
        int type = scanner.nextInt();

        System.out.print("Nhap chieu cao: ");
        int height = scanner.nextInt();

        System.out.println("\nTam giac vuong:");
        switch (type) {
            case 1: // Goc duoi trai
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2: // Goc tren trai
                for (int i = height; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3: // Goc duoi phai
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4: // Goc tren phai
                for (int i = height; i >= 1; i--) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Loai tam giac khong hop le!");
        }
    }

    public static void printIsoscelesTriangle(Scanner scanner) {
        System.out.print("Nhap chieu cao: ");
        int height = scanner.nextInt();

        System.out.println("\nTam giac can:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

