package l21_DesignPatterns.TrienKhaiObjectPool;

public class TaxiNotFoundException extends RuntimeException {
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}