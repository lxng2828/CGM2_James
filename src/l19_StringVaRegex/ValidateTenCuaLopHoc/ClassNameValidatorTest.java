package l19_StringVaRegex.ValidateTenCuaLopHoc;

public class ClassNameValidatorTest {

    private static ClassNameValidator classNameValidator;

    public static final String[] validClassNames = new String[] { "C0223G", "A0323K", "P1000H", "C9999I" };
    public static final String[] invalidClassNames = new String[] { "M0318G", "P0323A", "C001J", "A12345G", "C123G",
            "a0123H", "C0123h", "P1234 " };

    public static void main(String[] args) {
        classNameValidator = new ClassNameValidator();

        System.out.println("Kiem tra cac ten lop hop le:");
        for (String className : validClassNames) {
            boolean isValid = classNameValidator.validate(className);
            System.out.println("Ten lop la " + className + " co hop le khong: " + isValid);
        }

        System.out.println("\nKiem tra cac ten lop khong hop le:");
        for (String className : invalidClassNames) {
            boolean isValid = classNameValidator.validate(className);
            System.out.println("Ten lop la " + className + " co hop le khong: " + isValid);
        }
    }
}