package l12_JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public boolean addProduct(Product product) {
        if (findProductById(product.getId()) != null) {
            System.out.println("Loi: ID san pham da ton tai.");
            return false;
        }
        productList.add(product);
        System.out.println("Them san pham thanh cong.");
        return true;
    }

    public Product findProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public boolean updateProduct(int id, String newName, double newPrice) {
        Product productToUpdate = findProductById(id);
        if (productToUpdate != null) {
            productToUpdate.setName(newName);
            productToUpdate.setPrice(newPrice);
            System.out.println("Cap nhat san pham ID " + id + " thanh cong.");
            return true;
        } else {
            System.out.println("Loi: Khong tim thay san pham voi ID " + id + " de cap nhat.");
            return false;
        }
    }

    public boolean deleteProduct(int id) {
        Product productToDelete = findProductById(id);
        if (productToDelete != null) {
            productList.remove(productToDelete);
            System.out.println("Xoa san pham ID " + id + " thanh cong.");
            return true;
        } else {
            System.out.println("Loi: Khong tim thay san pham voi ID " + id + " de xoa.");
            return false;
        }
    }

    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sach san pham rong.");
            return;
        }
        System.out.println("--- Danh Sach San Pham ---");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
        System.out.println("--------------------------");
    }

    public List<Product> findProductByName(String name) {
        List<Product> foundProducts = new ArrayList<>();
        String searchNameLower = name.toLowerCase();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(searchNameLower)) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }

    public void sortProductsByPrice(boolean ascending) {
        if (productList.isEmpty()) {
            System.out.println("Danh sach rong, khong can sap xep.");
            return;
        }

        if (ascending) {
            Collections.sort(productList, new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
            });
            System.out.println("Da sap xep danh sach theo gia tang dan.");
        } else {
            Collections.sort(productList, new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {
                    return Double.compare(p2.getPrice(), p1.getPrice());
                }
            });
            System.out.println("Da sap xep danh sach theo gia giam dan.");
        }

        displayProducts();
    }
}
