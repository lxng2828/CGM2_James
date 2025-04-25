package l12_JavaCollectionFramework;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // --- Getters ---
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // --- Setters (Chi cho phep sua ten va gia, khong sua ID) ---
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // --- Hien thi thong tin san pham ---
    @Override
    public String toString() {
        // Dinh dang chuoi de hien thi
        return "San pham [ID=" + id + ", Ten='" + name + "', Gia=" + price + "]";
    }

    // --- Equals & HashCode (Quan trong neu dung Set hoac Map, so sanh theo ID) ---
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return id == product.id; // San pham duoc coi la giong nhau neu cung ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // HashCode dua tren ID
    }
}
