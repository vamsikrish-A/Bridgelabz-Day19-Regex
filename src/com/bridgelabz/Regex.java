package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
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
    public void passwordRule1() {
        System.out.println("Password Rule1.");
        System.out.println(Pattern.matches("[A-Za-z0-9+-_.@]{8}","Vamsi@_A"));  //ture follows format.
        System.out.println(Pattern.matches("[A-Za-z0-9+-_.@]{8}","Vamsi@krish")); //false, more characters.
        System.out.println(Pattern.matches("[A-Za-z0-9+-_.@]{8}","Vamsi@5")); //false, less char.
    }
    public void passwordRule2() {
        System.out.println("Password rule2");
        System.out.println(Pattern.matches("[A-Z]+[a-z0-9+-_@]{7}","Vamsi@_A"));  //ture follows format.
        System.out.println(Pattern.matches("[A-Z]+[a-z0-9+-_.@]{7}","Vamsi@_krish")); //false, more characters.
        System.out.println(Pattern.matches("[A-Z]+[a-z0-9+-_.@]{7}","Vamsi@5")); //false, less char.
    }
    public void passwordRule3() {
        System.out.println("Password rule 3");
        System.out.println(Pattern.matches("[A-Za-z+-_@]{7}[0-9]+","Vamsi@_5"));  //ture follows format.
        System.out.println(Pattern.matches("[A-Za-z+-_.@]{7}[0-9]+","Vam@5555")); //true.
        System.out.println(Pattern.matches("[A-Za-z+-_.@]{7}[0-9]+","Vamsi@55")); //true.
    }
    public void passwordRule4() {
        System.out.println("Password rule 4");
        System.out.println(Pattern.matches("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})","Vamsi@55"));  //ture follows format.
        System.out.println(Pattern.matches("[A-Za-z0-9]{7}[@-_+!]","Vamsikri")); //false, more characters.
        System.out.println(Pattern.matches("[A-Za-z0-9]{7}[@-_+!]","Vamsi@55")); //false, less char.
    }
    public void validEmailTest() {
        List emails = new ArrayList();

        //Valid Emails
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@yahoo.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        //Invalid Emails
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@%*.com");

        //Regex in top level domain
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[w!#$%&'*+/=?{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);

        for (Object email: emails) {
            Matcher matcher = pattern.matcher((CharSequence) email);
            System.out.println(email +" : "+ matcher.matches());

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Regex.");
        //calling methods.
        Regex validation = new Regex();
        //validation.validFirstName();
        //validation.validLastName();
        //validation.emailValidation();
        //validation.mobileNumber("9800088899"); //valid number
        //validation.mobileNumber("91 980008889"); //Invalid number
        //validation.mobileNumber("09800088899"); //invalid
        //validation.mobileNumber("7780088899"); //valid number
        //validation.mobileNumber("91980008889");//invalid
        validation.passwordRule1();
        validation.passwordRule2();
        validation.passwordRule3();
        validation.passwordRule4();
        validation.validEmailTest();


    }

}
