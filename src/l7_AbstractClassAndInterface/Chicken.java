package l7_AbstractClassAndInterface;

public class Chicken extends Animal implements Edible {
    private String color;

    public Chicken(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Chicken color %s", color);
    }

    @Override
    public void makeSound() {
        System.out.println("O o o");
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
