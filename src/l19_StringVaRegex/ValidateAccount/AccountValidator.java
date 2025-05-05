package l19_StringVaRegex.ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountValidator {

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    private Pattern pattern;

    public AccountValidator() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String accountName) {
        if (accountName == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(accountName);
        return matcher.matches();
    }
}