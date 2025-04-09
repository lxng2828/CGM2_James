package l1_IntroductionToJava;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("ten cua ban la gi: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("xin chao " + name);
    }
}
