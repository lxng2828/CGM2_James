package l1_IntroductionToJava;

import java.util.Scanner;

public class DocSoBaChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tu 0 den 999: ");
        int so = scanner.nextInt();

        if (so < 0 || so > 999) {
            System.out.println("Chi ho tro tu 0 den 999");
        } else {
            String ketQua = "";

            int tram = so / 100;
            int chuc = (so % 100) / 10;
            int donVi = so % 10;

            // Đọc hàng trăm
            if (tram > 0) {
                if (tram == 1)
                    ketQua += "Mot tram";
                else if (tram == 2)
                    ketQua += "Hai tram";
                else if (tram == 3)
                    ketQua += "Ba tram";
                else if (tram == 4)
                    ketQua += "Bon tram";
                else if (tram == 5)
                    ketQua += "Nam tram";
                else if (tram == 6)
                    ketQua += "Sau tram";
                else if (tram == 7)
                    ketQua += "Bay tram";
                else if (tram == 8)
                    ketQua += "Tam tram";
                else if (tram == 9)
                    ketQua += "Chin tram";
            }

            // Đọc hàng chục
            if (chuc > 0) {
                if (!ketQua.equals(""))
                    ketQua += " ";

                if (chuc == 1)
                    ketQua += "Muoi";
                else if (chuc == 2)
                    ketQua += "Hai muoi";
                else if (chuc == 3)
                    ketQua += "Ba muoi";
                else if (chuc == 4)
                    ketQua += "Bon muoi";
                else if (chuc == 5)
                    ketQua += "Nam muoi";
                else if (chuc == 6)
                    ketQua += "Sau muoi";
                else if (chuc == 7)
                    ketQua += "Bay muoi";
                else if (chuc == 8)
                    ketQua += "Tam muoi";
                else if (chuc == 9)
                    ketQua += "Chin muoi";
            } else if (tram > 0 && donVi != 0) {
                // Trường hợp có hàng trăm, nhưng chục = 0, và đơn vị khác 0 → phải đọc "le"
                ketQua += " le";
            }

            // Đọc hàng đơn vị
            if (donVi > 0 || so == 0) {
                if (!ketQua.equals(""))
                    ketQua += " ";

                if (donVi == 1)
                    ketQua += "Mot";
                else if (donVi == 2)
                    ketQua += "Hai";
                else if (donVi == 3)
                    ketQua += "Ba";
                else if (donVi == 4)
                    ketQua += "Bon";
                else if (donVi == 5)
                    ketQua += "Nam";
                else if (donVi == 6)
                    ketQua += "Sau";
                else if (donVi == 7)
                    ketQua += "Bay";
                else if (donVi == 8)
                    ketQua += "Tam";
                else if (donVi == 9)
                    ketQua += "Chin";
                else if (donVi == 0 && so == 0)
                    ketQua = "Khong";
            }

            System.out.println("Doc: " + ketQua);
        }

        scanner.close();
    }
}
