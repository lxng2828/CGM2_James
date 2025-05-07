package l21_DesignPatterns.FactoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("Tieng keu cua a1: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("Tieng keu cua a2: " + a2.makeSound());
    }
}
