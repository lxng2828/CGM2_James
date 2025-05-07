package l21_DesignPatterns.TrienKhaiSingleton;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();
        if (borrowedBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "Toi khong muon duoc sach";
    }

    public void returnBook() {
        if (haveBook) {
            borrowedBook.returnBook(borrowedBook);
            haveBook = false;
        }
    }
}