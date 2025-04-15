// Tạo lớp trừu tượng Animal, có phương thức makeSound().
// Tạo class con: Chicken, Tiger kế thừa từ Animal.
// Tạo interface Edible, có phương thức howToEat().
// Chicken cũng implements Edible.
// Tạo lớp trừu tượng Fruit implements Edible.
// Tạo class con: Orange, Apple.

package l7_AbstractClassAndInterface;

import java.util.Scanner;

public class LopAnimalVaInterfaceEdible {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. View apple and orange");
            System.out.println("2. View chicken and tiger");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Apple apple = new Apple("red");
                    Orange orange = new Orange("orange");
                    System.out.println(apple.toString());
                    System.out.println(apple.howToEat());
                    System.out.println(orange.toString());
                    System.out.println(orange.howToEat());
                    break;
                case 2:
                    Chicken chicken = new Chicken("brown");
                    Tiger tiger = new Tiger(800.0);
                    System.out.println(chicken.toString());
                    chicken.makeSound();
                    System.out.println(chicken.howToEat());
                    System.out.println(tiger.toString());
                    tiger.makeSound();
                    System.out.println(tiger.howToEat());
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
            scanner.close();
        }
    }

}
