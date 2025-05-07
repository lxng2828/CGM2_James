package l17_BinaryFileVaSerialization.QuanLySanPhamLuuRaFileNhiPhan;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private String productCode;
    private String productName;
    private double price;
    private String manufacturer;
    private String description;

    public Product(String productCode, String productName, double price, String manufacturer, String description) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "San pham [Ma: " + productCode + ", Ten: " + productName +
                ", Gia: " + String.format("%.2f", price) + ", Hang san xuat: " + manufacturer +
                ", Mo ta: " + description + "]";
    }
}