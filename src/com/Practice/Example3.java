package com.Practice;

import java.util.regex.Pattern;

public class Example3 {
    /*
    * x? ---- x occurs once or not at all
    * x+ ---- x occurs more than one time
    * x* ---- x occurs zero or more times
    * x{n} --- x occurs n times only
    * x{n, } --- x occurs n or more times only
    * x{y, z} --- x occurs at least y times but less than z times
    * */

    public static void main(String[] args) {
        System.out.println(" ? Quantifier.....");
        System.out.println(Pattern.matches("[ayz]?", "a"));         //true(a or y or z comes one time)
        System.out.println(Pattern.matches("[ayz]?", "aaa"));       //false(a occurs more than once)
        System.out.println(Pattern.matches("[ayz]?", "ayyyzz"));    //false(a y and z comes ,more than once)
        System.out.println(Pattern.matches("[ayz]?", "aaanta"));    //false(a comes more than once)
        System.out.println(Pattern.matches("[ayz]?", "ay"));        //false(a or y or z must come one time)
        System.out.println(" + Quantifiers....");
        System.out.println(Pattern.matches("[A-Z]+", "ABC"));        // true(a or y or z once or more times)
        System.out.println(Pattern.matches("[ayz]+", "aaa"));      //true(a comes more than one time)
        System.out.println(Pattern.matches("[ayz]+", "aaayyyzz")); //true(a or y or z comes more than one time)
        System.out.println(Pattern.matches("[ayz]+", "aasntsa"));  //false(s n t are not a matching pattern)
        System.out.println(" * Quantifiers...");
        System.out.println(Pattern.matches("[ayz]*","aaayyyzz"));  //true(a or y or z comes zero or more times )

    }
}
