package com.Practice;

import java.util.regex.*;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[xyz]", "wbcd"));                   //false(not x or y or z)
        System.out.println(Pattern.matches("[xyz]", "x"));                  //true(among x or y or z)
        System.out.println(Pattern.matches("[xyz]", "xxyyyz"));          //false( x and y comes more than once)

    }
}
