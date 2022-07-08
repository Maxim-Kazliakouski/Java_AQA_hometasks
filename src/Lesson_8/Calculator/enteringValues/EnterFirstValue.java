package Lesson_8.Calculator.enteringValues;

import java.util.Scanner;

public class EnterFirstValue {
    public double perform(){
        double firstValue;
        Scanner inputValue1 = new Scanner(System.in);
        System.out.println("Please enter a FIRST number!");
        System.out.print("'A' = ");
        while (!inputValue1.hasNextDouble()) {
            System.out.println("It's not a number!");
            System.out.println("Enter exactly NUMBER:");
            System.out.print("'A' = ");
            inputValue1.next();
        }
        firstValue = inputValue1.nextDouble();
        return firstValue;
    }
}
