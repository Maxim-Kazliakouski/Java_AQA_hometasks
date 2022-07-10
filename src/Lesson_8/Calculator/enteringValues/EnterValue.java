package Lesson_8.Calculator.enteringValues;

import java.util.Scanner;

public class EnterValue {
    public double perform(){
        double value;
        Scanner input = new Scanner(System.in);
        while (!input.hasNextDouble()) {
            System.out.println("It's not a number!");
            System.out.println("Enter exactly NUMBER:");
            input.next();
        }
        value = input.nextDouble();
        return value;
    }
}
