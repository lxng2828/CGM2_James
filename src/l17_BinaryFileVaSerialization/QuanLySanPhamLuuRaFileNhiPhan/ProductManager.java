package l17_BinaryFileVaSerialization.QuanLySanPhamLuuRaFileNhiPhan;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final String FILE_PATH = "products.dat";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nCHUONG TRINH QUAN LY SAN PHAM");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Tim kiem san pham");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Lua chon khong hop le. Vui long nhap so.");
                System.out.print("Lua chon cua ban: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 4);
        scanner.close();
    }

    private static void addProduct() {
        System.out.println("\nTHEM SAN PHAM MOI");
        System.out.print("Nhap ma san pham: ");
        String code = scanner.nextLine();

        System.out.print("Nhap ten san pham: ");
        String name = scanner.nextLine();

        double price = 0;
        boolean validPrice = false;
        while (!validPrice) {
            System.out.print("Nhap gia san pham: ");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                if (price >= 0) {
                    validPrice = true;
                } else {
                    System.out.println("Gia san pham phai la so duong.");
                }
            } else {
                System.out.println("Gia san pham khong hop le. Vui long nhap so.");
                scanner.next();
            }
        }
        scanner.nextLine();

        System.out.print("Nhap hang san xuat: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Nhap mo ta san pham: ");
        String description = scanner.nextLine();

        Product newProduct = new Product(code, name, price, manufacturer, description);
        List<Product> products = readProductsFromFile();
        products.add(newProduct);
        writeProductsToFile(products);
        System.out.println("Them san pham thanh cong!");
    }

    private static void displayProducts() {
        System.out.println("\nDANH SACH SAN PHAM");
        List<Product> products = readProductsFromFile();
        if (products.isEmpty()) {
            System.out.println("Khong co san pham nao de hien thi.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    private static void searchProduct() {
        System.out.println("\nTIM KIEM SAN PHAM");
        System.out.print("Nhap ma san pham can tim: ");
        String searchCode = scanner.nextLine();

        List<Product> products = readProductsFromFile();
        List<Product> foundProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getProductCode().equalsIgnoreCase(searchCode)) {
                foundProducts.add(product);
            }
        }

        if (foundProducts.isEmpty()) {
            System.out.println("Khong tim thay san pham nao voi ma: " + searchCode);
        } else {
            System.out.println("CAC SAN PHAM TIM THAY:");
            for (Product product : foundProducts) {
                System.out.println(product);
            }
        }
    }

    private static void writeProductsToFile(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.err.println("Loi khi ghi du lieu vao file: " + e.getMessage());
        }
    }

    private static List<Product> readProductsFromFile() {
        List<Product> products = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists() || file.length() == 0) {
            return products;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object obj = ois.readObject();
            if (obj instanceof List) {
                products = (List<Product>) obj;
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Loi khi doc du lieu tu file: " + e.getMessage());
        }
        return products;
    }
}