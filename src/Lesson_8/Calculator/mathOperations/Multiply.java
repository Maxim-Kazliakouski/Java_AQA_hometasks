package Lesson_8.Calculator.mathOperations;

import Lesson_8.Calculator.Calculator;

public class Multiply implements Calculator {
    public Multiply() {
        System.out.println("---------------------------");
        System.out.println("----Multiply operation----");
        System.out.println("---------------------------");
        System.out.println("Please enter 'A' and 'B' values:");
    }

    @Override
    public double action(double a, double b) {
        System.out.println("---------------------------");
        double result = a*b;
        System.out.format("Result of MULTIPLY operation is --> %.2f%n", result);
        System.out.println("---------------------------");
        System.out.printf("Please, choose another option%n");
        System.out.println("or back to the main menu:");
        return result;
    }
}
