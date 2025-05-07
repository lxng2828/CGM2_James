package l18_Threading.RacingCars;

import java.util.Random;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < Main.DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;

                String log = "|";
                int percentTravel = (runDistance * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Xe " + this.name + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Xe " + this.name + " da bi hong...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Xe " + this.name + " ve dich trong " + (endTime - startTime) / 1000 + " giay");
    }
}