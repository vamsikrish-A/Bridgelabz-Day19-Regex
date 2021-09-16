package com.Practice;

import java.util.regex.*;

public class RegexPractice {
    // Regular Expression, helps to search data, matching complex patterns.
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("AxxB");
        System.out.println("String matches the given regex:"+matcher.matches());
    }
}
