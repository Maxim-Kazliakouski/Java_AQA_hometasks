package Lesson_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer;
        answer = "I like Java!!!";
        System.out.printf("The last symbol of string '%s' --> %s%n", answer, answer.charAt(answer.length() - 1));
        System.out.println("------------------------");
        System.out.printf("Is the string '%s' ends on '!!!' --> %s%n", answer, answer.endsWith("!!!"));
        System.out.println("------------------------");
        System.out.printf("Is the string '%s' starts from 'I like' --> %s%n", answer, answer.startsWith("I like"));
        System.out.println("------------------------");
        System.out.printf("Is the string '%s' contains substring 'Java' --> %s%n", answer, answer.contains("Java"));
        System.out.println("------------------------");
        System.out.printf("The index of symbol of first entering of word 'Java' in string '%s' is --> %s%n",
                answer, answer.indexOf("Java"));
        System.out.println("------------------------");
        System.out.printf("The string '%s' in upper case mode --> %s%n", answer, answer.toUpperCase());
        System.out.println("------------------------");
        System.out.printf("The string '%s' in lower case mode --> %s%n", answer, answer.toLowerCase());
        System.out.println("------------------------");
        int firstSymbol = answer.indexOf("J");
        int lastSymbol = answer.indexOf("!");
        String subString = answer.substring(firstSymbol, lastSymbol);
        System.out.printf("The string 'Java' after using method substring --> %s%n", subString);
    }
}
