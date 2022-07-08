package Lesson_8.Calculator.enteringValues;

import java.util.Scanner;

public class EnterChoice {
    public int performChoice() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        while (!input.hasNextInt()) {
            System.out.println("It's not a number!");
            System.out.println("Enter exactly NUMBER for choosing:");
            input.next();
        }
        choice = input.nextInt();
        return choice;
    }
}
