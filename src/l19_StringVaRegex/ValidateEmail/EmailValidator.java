package l19_StringVaRegex.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private Pattern pt;
    private Matcher mc;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+$";

    public EmailValidator() {
        pt = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String emailAdressString) {
        if (emailAdressString == null) {
            return false;
        }
        mc = pt.matcher(emailAdressString);
        return mc.matches();
    }
}