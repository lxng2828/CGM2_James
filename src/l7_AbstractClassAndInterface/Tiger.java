package l7_AbstractClassAndInterface;

public class Tiger extends Animal implements Edible {

    private double weight;

    public Tiger(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Tiger with weight %.1f", weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Roarrrr");
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
