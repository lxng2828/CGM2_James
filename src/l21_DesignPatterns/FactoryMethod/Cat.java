package l21_DesignPatterns.FactoryMethod;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}