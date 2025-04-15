// Tạo lớp trừu tượng Animal, có phương thức makeSound().
// Tạo class con: Chicken, Tiger kế thừa từ Animal.
// Tạo interface Edible, có phương thức howToEat().
// Chicken cũng implements Edible.
// Tạo lớp trừu tượng Fruit implements Edible.
// Tạo class con: Orange, Apple.

package l7_AbstractClassAndInterface;

public class LopAnimalVaInterfaceEdible {
    public static void main(String[] args) {
        Apple apple = new Apple("red");
        Orange orange = new Orange("orange");
        System.out.println(apple.toString());
        System.out.println(apple.howToEat());
        System.out.println(orange.toString());
        System.out.println(orange.howToEat());
        Chicken chicken = new Chicken("brown");
        Tiger tiger = new Tiger(800.0);
        System.out.println(chicken.toString());
        chicken.makeSound();
        System.out.println(chicken.howToEat());
        System.out.println(tiger.toString());
        tiger.makeSound();
        System.out.println(tiger.howToEat());

    }

}
