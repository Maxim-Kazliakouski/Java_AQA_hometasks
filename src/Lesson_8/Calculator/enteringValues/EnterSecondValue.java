package Lesson_8.Calculator.enteringValues;

import java.util.Scanner;

public class EnterSecondValue {
    public double perform(){
        double secondValue;
        Scanner inputValue2 = new Scanner(System.in);
        System.out.println("Please enter a SECOND number!");
        System.out.print("'B' = ");
        while (!inputValue2.hasNextDouble()) {
            System.out.println("It's not a number!");
            System.out.println("Enter exactly NUMBER:");
            System.out.print("'B' = ");
            inputValue2.next();
        }
        secondValue = inputValue2.nextDouble();
        return secondValue;
    }
}
