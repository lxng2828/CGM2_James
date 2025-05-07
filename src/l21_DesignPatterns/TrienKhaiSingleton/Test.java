package l21_DesignPatterns.TrienKhaiSingleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("BAT DAU KIEM TRA MAU SINGLETON");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("\nNguoiMuon1 da yeu cau muon sach.");
        System.out.println("NguoiMuon1 - Thong tin sach da muon:");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("\nNguoiMuon2 da yeu cau muon sach.");
        System.out.println("NguoiMuon2 - Thong tin sach da muon:");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        System.out.println("\nNguoiMuon1 dang tra sach...");
        bookBorrower1.returnBook();
        System.out.println("NguoiMuon1 da tra sach.");
        System.out.println("NguoiMuon1 - Thong tin sach sau khi tra:");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("\nNguoiMuon2 yeu cau muon sach lai.");
        bookBorrower2.borrowBook();
        System.out.println("NguoiMuon2 - Thong tin sach da muon (sau khi NguoiMuon1 tra):");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        System.out.println("\nKET THUC KIEM TRA MAU SINGLETON");
    }
}