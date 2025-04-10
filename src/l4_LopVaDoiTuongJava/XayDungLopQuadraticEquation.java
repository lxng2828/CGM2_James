package l4_LopVaDoiTuongJava;

import java.util.Scanner;

public class XayDungLopQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giai phuong trinh bac hai ax^2 + bx + c = 0");

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        QuadraticEquation phuongtrinh = new QuadraticEquation(a, b, c);

        double delta = phuongtrinh.getDiscriminant();
        System.out.println("Delta = " + delta);

        if (delta > 0) {
            double root1 = phuongtrinh.getRoot1();
            double root2 = phuongtrinh.getRoot2();
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("Nghiem 1 (x1) = " + root1);
            System.out.println("Nghiem 2 (x2) = " + root2);
        } else if (delta == 0) {
            double root = phuongtrinh.getRoot1();
            System.out.println("Phuong trinh co nghiem kep:");
            System.out.println("Nghiem (x1 = x2) = " + root);
        } else {
            System.out.println("Phuong trinh khong co nghiem thuc");
        }

        scanner.close();
    }
}

