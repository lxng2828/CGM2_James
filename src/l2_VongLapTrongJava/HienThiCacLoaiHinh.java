package l2_VongLapTrongJava;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (4 corners)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
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
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 0);
    }

    public static void printRectangle(Scanner scanner) {
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        System.out.println("\nRectangle:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle(Scanner scanner) {
        System.out.println("\nChoose corner position:");
        System.out.println("1. Bottom-left");
        System.out.println("2. Top-left");
        System.out.println("3. Bottom-right");
        System.out.println("4. Top-right");
        System.out.print("Enter your choice: ");
        int type = scanner.nextInt();

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("\nSquare triangle:");
        switch (type) {
            case 1: // Bottom-left
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2: // Top-left
                for (int i = height; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3: // Bottom-right
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
            case 4: // Top-right
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
                System.out.println("Invalid triangle type!");
        }
    }

    public static void printIsoscelesTriangle(Scanner scanner) {
        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("\nIsosceles triangle:");
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
