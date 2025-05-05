package l19_StringVaRegex.ValidateSoDienThoai;

public class PhoneNumberValidatorTest {

    private static PhoneNumberValidator phoneNumberValidator;

    public static final String[] validPhoneNumbers = new String[] { "(84)-(0978489648)", "(12)-(0123456789)",
            "(99)-(0999999999)" };
    public static final String[] invalidPhoneNumbers = new String[] {
            "(a8)-(0222222222)",
            "(84)-(22b2222222)",
            "(84)-(9978489648)",
    };

    public static void main(String[] args) {
        phoneNumberValidator = new PhoneNumberValidator();

        System.out.println("Kiem tra cac so dien thoai hop le:");
        for (String phoneNumber : validPhoneNumbers) {
            boolean isValid = phoneNumberValidator.validate(phoneNumber);
            System.out.println("So dien thoai la " + phoneNumber + " co hop le khong: " + isValid);
        }

        System.out.println("\nKiem tra cac so dien thoai khong hop le:");
        for (String phoneNumber : invalidPhoneNumbers) {
            boolean isValid = phoneNumberValidator.validate(phoneNumber);
            System.out.println("So dien thoai la " + phoneNumber + " co hop le khong: " + isValid);
        }
    }
}