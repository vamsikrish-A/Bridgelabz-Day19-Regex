package com.Practice;

import java.util.regex.Pattern;

public class MetaCharacters {
    /* . --- can be any char
    *  d --- represents any digits
    *  D --- represents any non digits
    *  s --- represents any white spaces
    *  S --- Non white space characters
    *  w --- word char
    *  W --- word char
    *  b --- word boundary
    *  B --- non word boundary*/
    public static void main(String[] args) {
        System.out.println("Metacharacters d...");
        System.out.println(Pattern.matches("d","abc"));  //false (non digit)
        System.out.println(Pattern.matches("d","1"));   //true(digit)
        System.out.println(Pattern.matches("d","4443"));  //false(digit but comes more than once)
        System.out.println(Pattern.matches("d","323abc"));  //false(digit and char)

        System.out.println("Metacharacters  D...");
        System.out.println(Pattern.matches("D+","abc"));  //false (non digit bur comes more than once)
        System.out.println(Pattern.matches("D","1"));  //false (digit)
        System.out.println(Pattern.matches("D","4443"));  //false (digit)
        System.out.println(Pattern.matches("D","323abc"));  //false (digit and char)
        System.out.println(Pattern.matches("D","m"));  //true (digit and comes once)

        System.out.println("metacharacters D with Quantifier...");
        System.out.println(Pattern.matches("D*","abc")); //true (non digit and comes more times)


    }
}
