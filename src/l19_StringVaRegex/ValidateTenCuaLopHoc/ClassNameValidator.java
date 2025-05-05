package l19_StringVaRegex.ValidateTenCuaLopHoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {

    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    private Pattern pattern;

    public ClassNameValidator() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String className) {
        if (className == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}