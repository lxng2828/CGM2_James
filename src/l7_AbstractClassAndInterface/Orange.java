package l7_AbstractClassAndInterface;

public class Orange extends Fruit {
    private String color;

    public Orange(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Orange color %s", color);
    }

    @Override
    public String howToEat() {
        return "Peel and eat";
    }
}
