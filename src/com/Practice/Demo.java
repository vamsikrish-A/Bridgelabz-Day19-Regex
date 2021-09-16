package com.Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            while (true) {
                System.out.println("Enter regex pattern: ");
                String regexPatter = sc.nextLine();
                Pattern pattern = Pattern.compile(regexPatter);
                Matcher matcher = pattern.matcher("Welcome to Edureka Youtube Channel");
                boolean found = false;
                while (matcher.find()) {
                    System.out.println("Found the text " +matcher.group() +" Starting at index " +matcher.start()+" and ending at index "+matcher.end());
                    found = true;
                }
                if (!found) {
                    System.out.println("Match not found.");
                }
            }

        }
    }
}
