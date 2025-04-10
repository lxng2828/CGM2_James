package l4_LopVaDoiTuongJava;

public class LopHinhChuNhat {
    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle();
        Rectangle hcn2 = new Rectangle(5.5, 10.5);
        hcn1.display();
        hcn2.display();
        System.out.println("dien tich hcn2: " + hcn2.getArea());
    }
}
