package l8_CleanCode.Refactoring;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bat dau chuong trinh mo phong Tennis Game:");
        System.out.println("-----------------------------------------");

        TennisGame game1 = new TennisGame("Nadal", "Federer");
        System.out.println("\nTran dau 1: Nadal vs Federer");
        System.out.println("Khoi dau: " + game1.getScore());

        game1.wonPoint("Nadal");
        System.out.println("Nadal ghi diem (1-0): " + game1.getScore());
        game1.wonPoint("Federer");
        System.out.println("Federer ghi diem (1-1): " + game1.getScore());

        game1.wonPoint("Nadal");
        System.out.println("Nadal ghi diem (2-1): " + game1.getScore());
        game1.wonPoint("Nadal");
        System.out.println("Nadal ghi diem (3-1): " + game1.getScore());

        game1.wonPoint("Federer");
        System.out.println("Federer ghi diem (3-2): " + game1.getScore());
        game1.wonPoint("Federer");
        System.out.println("Federer ghi diem (3-3 Deuce): " + game1.getScore());

        game1.wonPoint("Nadal");
        System.out.println("Nadal ghi diem (Adv Nadal): " + game1.getScore());

        game1.wonPoint("Federer");
        System.out.println("Federer ghi diem (Deuce): " + game1.getScore());

        game1.wonPoint("Nadal");
        System.out.println("Nadal ghi diem (Adv Nadal): " + game1.getScore());

        game1.wonPoint("Nadal");
        System.out.println("Nadal ghi diem (Win Nadal): " + game1.getScore());

        TennisGame game2 = new TennisGame("Djokovic", "Murray");
        System.out.println("\nTran dau 2: Djokovic vs Murray");
        System.out.println("Khoi dau: " + game2.getScore());

        game2.wonPoint("Djokovic"); // 1-0
        game2.wonPoint("Djokovic"); // 2-0
        game2.wonPoint("Djokovic"); // 3-0
        System.out.println("Djokovic dan truoc 3 diem: " + game2.getScore());

        game2.wonPoint("Murray"); // 3-1
        game2.wonPoint("Murray"); // 3-2
        game2.wonPoint("Murray"); // 3-3 Deuce
        System.out.println("Murray go hoa Deuce: " + game2.getScore());

        game2.wonPoint("Murray"); // Adv Murray
        System.out.println("Murray loi the: " + game2.getScore());

        game2.wonPoint("Murray"); // Win Murray
        System.out.println("Murray thang: " + game2.getScore());

        TennisGame game3 = new TennisGame("Tuan", "Linh");
        System.out.println("\nTran dau 3: Tuan vs Linh");
        String[] pointsWinnerGame3 = { "Tuan", "Linh", "Tuan", "Linh", "Tuan", "Linh", "Tuan", "Tuan" };
        System.out.println("Khoi dau: " + game3.getScore());
        for (String winner : pointsWinnerGame3) {
            game3.wonPoint(winner);
            System.out.println(winner + " ghi diem: " + game3.getScore());
        }

        System.out.println("-----------------------------------------");
        System.out.println("Ket thuc chuong trinh.");
    }
}