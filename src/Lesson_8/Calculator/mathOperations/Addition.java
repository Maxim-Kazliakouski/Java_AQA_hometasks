package Lesson_8.Calculator.mathOperations;

import Lesson_8.Calculator.Calculator;

public class Addition implements Calculator {
    public Addition() {
        System.out.println("---------------------------");
        System.out.println("-----Addition operation----");
        System.out.println("---------------------------");
        System.out.println("Please enter 'A' and 'B' values:");
    }

    @Override
    public double action(double a, double b) {
        System.out.println("---------------------------");
        System.out.println("Result of ADDITION operation is --> " + (a + b));
        double result = a + b;
        System.out.println("---------------------------");
        System.out.printf("Please, choose another option%n");
        System.out.println("or back to the main menu:");
        return result;
    }
}
