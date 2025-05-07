package l18_Threading.RacingCars;

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread threadA = new Thread(carA);
        Thread threadB = new Thread(carB);
        Thread threadC = new Thread(carC);

        System.out.println("Quang duong dua: " + DISTANCE + "KM");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}