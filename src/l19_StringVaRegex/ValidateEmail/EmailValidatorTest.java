package l19_StringVaRegex.ValidateEmail;

public class EmailValidatorTest {

    private static EmailValidator eV;

    public static final String[] validEmails = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmails = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        eV = new EmailValidator();

        System.out.println("Kiem tra cac email hop le:");
        for (String email : validEmails) {
            boolean isValid = eV.validate(email);
            System.out.println("Email la " + email + " co hop le khong: " + isValid);
        }

        System.out.println("\nKiem tra cac email khong hop le:");
        for (String email : invalidEmails) {
            boolean isValid = eV.validate(email);
            System.out.println("Email la " + email + " co hop le khong: " + isValid);
        }
    }
}