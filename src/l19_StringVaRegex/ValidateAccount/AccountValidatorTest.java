package l19_StringVaRegex.ValidateAccount;

public class AccountValidatorTest {

    private static AccountValidator accountValidator;

    public static final String[] validAccounts = new String[] { "123abc_", "_abc123", "______", "123456", "abcdefgh" };
    public static final String[] invalidAccounts = new String[] { ".@", "12345", "1234_", "abcde", "ABCDEF" };

    public static void main(String args[]) {
        accountValidator = new AccountValidator();

        System.out.println("Kiem tra cac tai khoan hop le:");
        for (String account : validAccounts) {
            boolean isValid = accountValidator.validate(account);
            System.out.println("Tai khoan la " + account + " co hop le khong: " + isValid);
        }

        System.out.println("\nKiem tra cac tai khoan khong hop le:");
        for (String account : invalidAccounts) {
            boolean isValid = accountValidator.validate(account);
            System.out.println("Tai khoan la " + account + " co hop le khong: " + isValid);
        }
    }
}