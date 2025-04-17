package l6_KeThua;

public class LopPoinvaMoveablePoint {
    public static void main(String[] args) {
        // Tạo đối tượng Point
        Point p1 = new Point(1.1f, 2.2f);
        System.out.println("Điểm P1: " + p1);

        // Tạo đối tượng MovablePoint
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("Điểm MP1 ban đầu: " + mp1);

        // Di chuyển điểm
        mp1.move();
        System.out.println("MP1 sau lần di chuyển 1: " + mp1);

        // Thay đổi tốc độ và di chuyển tiếp
        mp1.setXSpeed(-1.0f);
        mp1.setYSpeed(0.0f);
        System.out.println("Tốc độ mới của MP1: (" + mp1.getXSpeed() + "," + mp1.getYSpeed() + ")");

        mp1.move(); // Di chuyển lần 2
        System.out.println("MP1 sau lần di chuyển 2: " + mp1);

        // Lấy mảng tốc độ
        float[] speed = mp1.getSpeed();
        System.out.println("Mảng tốc độ MP1: [" + speed[0] + ", " + speed[1] + "]");

        // Tạo đối tượng MovablePoint bằng constructor khác
        MovablePoint mp2 = new MovablePoint(0.1f, -0.2f); // Tọa độ ban đầu (0,0)
        System.out.println("Điểm MP2 ban đầu: " + mp2);
        mp2.move().move(); // Gọi move nối tiếp
        System.out.println("MP2 sau 2 lần di chuyển: " + mp2);
    }
}