package l12_JavaCollectionFramework;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LuyenTapSuDungArrayListLinkedListTrongJavaCollectionFramework {
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        int choice = -1;

        do {
            displayMenu();
            try {
                System.out.print("Nhap lua chon cua ban: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Doc bo dong con lai sau khi nhap so

                switch (choice) {
                    case 1:
                        addProduct(scanner, manager);
                        break;
                    case 2:
                        updateProduct(scanner, manager);
                        break;
                    case 3:
                        deleteProduct(scanner, manager);
                        break;
                    case 4:
                        manager.displayProducts();
                        break;
                    case 5:
                        searchProductByName(scanner, manager);
                        break;
                    case 6:
                        manager.sortProductsByPrice(true); // true = tang dan
                        break;
                    case 7:
                        manager.sortProductsByPrice(false); // false = giam dan
                        break;
                    case 0:
                        System.out.println("Thoat chuong trinh...");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Loi: Vui long nhap mot so nguyen.");
                scanner.nextLine(); // Doc bo du lieu khong hop le
                choice = -1; // Dat lai lua chon de vong lap tiep tuc
            }
            System.out.println(); // Them dong trong cho de nhin

        } while (choice != 0);

        scanner.close(); // Dong scanner khi ket thuc
    }

    public static void displayMenu() {
        System.out.println("===== MENU QUAN LY SAN PHAM =====");
        System.out.println("1. Them san pham");
        System.out.println("2. Sua thong tin san pham theo ID");
        System.out.println("3. Xoa san pham theo ID");
        System.out.println("4. Hien thi danh sach san pham");
        System.out.println("5. Tim kiem san pham theo ten");
        System.out.println("6. Sap xep san pham tang dan theo gia");
        System.out.println("7. Sap xep san pham giam dan theo gia");
        System.out.println("0. Thoat");
        System.out.println("================================");
    }

    public static void addProduct(Scanner scanner, ProductManager manager) {
        try {
            System.out.print("Nhap ID san pham: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Doc bo dong con lai

            if (id < 0) {
                System.out.println("Loi: ID khong the la so am.");
                return;
            }

            if (manager.findProductById(id) != null) {
                System.out.println("Loi: ID san pham da ton tai.");
                return;
            }

            System.out.print("Nhap ten san pham: ");
            String name = scanner.nextLine();

            System.out.print("Nhap gia san pham: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Doc bo dong con lai

            if (price < 0) {
                System.out.println("Loi: Gia khong the la so am.");
                return;
            }

            Product newProduct = new Product(id, name, price);
            manager.addProduct(newProduct);

        } catch (InputMismatchException e) {
            System.out.println("Loi: Du lieu nhap vao khong hop le (ID phai la so, Gia phai la so).");
            scanner.nextLine(); // Doc bo du lieu khong hop le
        }
    }

    public static void updateProduct(Scanner scanner, ProductManager manager) {
        try {
            System.out.print("Nhap ID san pham can sua: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Doc bo dong con lai

            if (manager.findProductById(id) == null) {
                System.out.println("Loi: Khong tim thay san pham voi ID " + id + ".");
                return;
            }

            System.out.print("Nhap ten moi cho san pham: ");
            String newName = scanner.nextLine();

            System.out.print("Nhap gia moi cho san pham: ");
            double newPrice = scanner.nextDouble();
            scanner.nextLine(); // Doc bo dong con lai

            if (newPrice < 0) {
                System.out.println("Loi: Gia khong the la so am.");
                return;
            }

            manager.updateProduct(id, newName, newPrice);

        } catch (InputMismatchException e) {
            System.out.println("Loi: Du lieu nhap vao khong hop le (ID phai la so, Gia phai la so).");
            scanner.nextLine(); // Doc bo du lieu khong hop le
        }
    }

    public static void deleteProduct(Scanner scanner, ProductManager manager) {
        try {
            System.out.print("Nhap ID san pham can xoa: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Doc bo dong con lai

            manager.deleteProduct(id);

        } catch (InputMismatchException e) {
            System.out.println("Loi: ID phai la mot so nguyen.");
            scanner.nextLine(); // Doc bo du lieu khong hop le
        }
    }

    public static void searchProductByName(Scanner scanner, ProductManager manager) {
        System.out.print("Nhap ten san pham can tim: ");
        String name = scanner.nextLine();

        List<Product> results = manager.findProductByName(name);

        if (results.isEmpty()) {
            System.out.println("Khong tim thay san pham nao voi ten chua '" + name + "'.");
        } else {
            System.out.println("--- Ket Qua Tim Kiem ---");
            for (Product product : results) {
                System.out.println(product.toString());
            }
            System.out.println("------------------------");
        }
    }
}
