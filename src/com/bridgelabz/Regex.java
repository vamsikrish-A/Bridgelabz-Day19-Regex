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

    public void validFirstName() {
        //uSing Quantifiers for first name
        System.out.println("Valid Firstname ");
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Vams"));  //True , first name starts with cap and has minimum 3 characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Vamsi")); //false, has more characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","vams"));  //false, has no cap and more characters.

    }
    public void validLastName() {
        //uSing Quantifiers for last name
        System.out.println("Valid Lastname ");
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Kris"));  //True , first name starts with cap and has minimum 3 characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Krishna")); //false, has more characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","krishna")); //false, has no cap and more characters.

    }

    public void emailValidation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email: ");
        String name = sc.nextLine();
        // Regular Expression to validate E-mail.
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";;

        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);

        //Creating Matcher object.
        Matcher matcher = pattern.matcher(name);

        //verifying give name is valid or not.
        if (matcher.matches())
            System.out.println("E-mail is valid.");
        else
            System.out.println("E-mail is Invalid.");
    }
    public void mobileNumber(String str) {
       //function to check mobile number is valid or not.
        //(0/91): country code.
        //(7-9): starting digits between 7,8,9.
        //(0-9): last 9 digits.
        Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher matcher = pattern.matcher(str);

        //returns a boolean value.
        if (matcher.find() && matcher.group().equals(str))
            System.out.println("Valid Number.");
        else
            System.out.println("Invalid Number.");


    }

    public static void main(String[] args) {
        System.out.println("Welcome to Regex.");
        //calling methods.
        Regex validation = new Regex();
        validation.validFirstName();
        validation.validLastName();
        validation.emailValidation();
        validation.mobileNumber("9800088899"); //valid number
        validation.mobileNumber("91 980008889"); //Invalid number
        validation.mobileNumber("09800088899"); //invalid
        validation.mobileNumber("7780088899"); //valid number
        validation.mobileNumber("91980008889");//invalid



    }

}
