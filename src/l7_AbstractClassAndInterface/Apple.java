package l7_AbstractClassAndInterface;

public class Apple extends Fruit {

    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public String howToEat() {
        return "could be sliced";
    }

    @Override
    public String toString() {
        return String.format("Apple color %s", color);
    }

}
