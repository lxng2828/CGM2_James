package l9_AutomatedTestingAndTDD;

public class Main {
    public static void main(String[] args) {
        testNextDay(31, 1, 2023);
        testNextDay(28, 2, 2023);
        testNextDay(28, 2, 2024);
        testNextDay(29, 2, 2024);
        testNextDay(31, 12, 2023);
        testNextDay(15, 8, 2023);
        testNextDay(30, 4, 2023);

        testNextDay(31, 4, 2023);
        testNextDay(0, 5, 2023);
        testNextDay(10, 13, 2023);
        testNextDay(10, 10, -1);
    }

    public static void testNextDay(int day, int month, int year) {
        String result = NextDayCalculator.layNgayTiepTheo(day, month, year);
        System.out.println("ngay truoc: " + day + "/" + month + "/" + year + " => ngay sau: " + result);
    }
}
