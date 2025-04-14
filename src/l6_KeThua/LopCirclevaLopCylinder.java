package l6_KeThua;

public class LopCirclevaLopCylinder {
    public static void main(String[] args) {
        Circle1 hinhtron = new Circle1(5.0, "blue");
        Cylinder1 hinhtru = new Cylinder1(5.0, "red", 10.0);

        System.out.println("dien tich hinh tron: " + hinhtron.getArea());
        System.out.println("the tich hinh tru: " + hinhtru.getVolume());
        System.out.println(hinhtron.toString());
        System.out.println(hinhtru.toString());

    }
}
