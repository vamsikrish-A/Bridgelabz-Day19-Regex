package com.Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTER = "^[ A-ZA-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTER);
    }

    public boolean validator(final String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }

}
