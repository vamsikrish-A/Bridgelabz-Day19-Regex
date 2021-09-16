package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* @author: Vamsi Krishna A
* @purpose: User registration validation
* @date: 16/09/2021
* */
public class Regex {
    public static void main(String[] args) {
        System.out.println("Welcome to Regex.");

        //uSing Quantifiers for first name
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Vams"));  //True , first name starts with cap and has minimum 3 characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Vamsi")); //false, has more characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","vams"));  //false, has no cap and more characters.
    }
}
