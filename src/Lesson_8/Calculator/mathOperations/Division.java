package Lesson_8.Calculator.mathOperations;

import Lesson_8.Calculator.Calculator;

public class Division implements Calculator {
    public Division() {
        System.out.println("---------------------------");
        System.out.println("-----Division operation----");
        System.out.println("---------------------------");
        System.out.println("Please enter 'A' and 'B' values:");
    }

    @Override
    public void action(double a, double b) {
        System.out.println("---------------------------");
        if (b == 0) {
            System.out.println("Division by ZERO!");
        }
        else {
            double result = a/b;
            System.out.format("Result of DIVISION operation is --> %.2f%n", result);
        }
        System.out.println("---------------------------");
        System.out.printf("Please, choose another option%n");
        System.out.println("or back to the main menu:");
    }
}
