package Lesson_10;

import java.util.Scanner;

public class CompoundWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word with even number of letters:");
        String firstWord = input.nextLine();
        while (firstWord.length() % 2 != 0) {
            System.out.printf("You've entered word with odd number of letters --> %s%n", firstWord.length());
            firstWord = input.nextLine();
        }
        System.out.println("Enter second word with even number of letters:");
        String secondWord = input.nextLine();
        while (secondWord.length() % 2 != 0) {
            System.out.printf("You've entered word with odd number of letters --> %s%n", secondWord.length());
            secondWord = input.nextLine();
        }
        String firstPart = firstWord.substring(0, (firstWord.length() / 2));
        String secondPart = secondWord.substring(secondWord.length() / 2);
        StringBuilder string = new StringBuilder();
        System.out.println("New word contains from two parts --> " + string.append(firstPart).append(secondPart));
    }
}

//        Ввести 2 слова, состоящие из четного числа букв.
//        Получить слово состоящее из первой половины первого
//        слова и второй половины второго слова.