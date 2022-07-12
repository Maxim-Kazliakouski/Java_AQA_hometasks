package Lesson_8.Calculator.invoke;

import Lesson_8.Calculator.enteringValues.EnterValue;
import Lesson_8.Calculator.mathOperations.Addition;
import Lesson_8.Calculator.mathOperations.Division;
import Lesson_8.Calculator.mathOperations.Multiply;
import Lesson_8.Calculator.mathOperations.Subtraction;

public class OperationsMenu extends Lesson_8.Calculator.menuDescription.OperationsMenu {
    // creating array for results and set the array's length
    static String[] resultsCalculate = new String[3];
    static int indexPosition = 0;

    public int invoke() {
        int choice = show();
        while (choice != 0 && choice != 5) {
            if (choice == 1) {
                choice = calculateAddition();
            }
            if (choice == 2) {
                choice = calculateSubtraction();
            }
            if (choice == 3) {
                choice = calculateDivision();
            }
            if (choice == 4) {
                choice = calculateMultiply();
            }
        }
        return choice;
    }

    private void descriptionFirstValue() {
        System.out.println("Please enter a FIRST number!");
        System.out.print("'A' = ");
    }

    private void descriptionSecondValue() {
        System.out.println("Please enter a SECOND number!");
        System.out.print("'B' = ");
    }

    public void recordCalculatingResult(double calcResult, String operation) {
        if (indexPosition >= resultsCalculate.length) {
            indexPosition = 0;
        }
        resultsCalculate[indexPosition] = indexPosition + 1 + ". " + operation + String.valueOf(calcResult);
        indexPosition++;
    }

    public void recordCalculatingResultDivByZero() {
        if (indexPosition >= resultsCalculate.length) {
            indexPosition = 0;
        }
        resultsCalculate[indexPosition] = indexPosition + 1 + ". " + "Division by ZERO!";
        indexPosition++;
    }

    private int calculateAddition() {
        EnterValue enterValue = new EnterValue();
        Addition addition = new Addition();
        descriptionFirstValue();
        double valueA = enterValue.perform();
        descriptionSecondValue();
        double valueB = enterValue.perform();
        double addResult = addition.action(valueA, valueB);
        recordCalculatingResult(addResult, "The result of ADDITION operation --> ");
        return show();
    }

    private int calculateSubtraction() {
        EnterValue enterValue = new EnterValue();
        Subtraction subtraction = new Subtraction();
        descriptionFirstValue();
        double valueA = enterValue.perform();
        descriptionSecondValue();
        double valueB = enterValue.perform();
        double addResult = subtraction.action(valueA, valueB);
        recordCalculatingResult(addResult, "The result of SUBTRACTION operation --> ");
        return show();
    }

    private int calculateDivision() {
        EnterValue enterValue = new EnterValue();
        Division division = new Division();
        descriptionFirstValue();
        double valueA = enterValue.perform();
        descriptionSecondValue();
        double valueB = enterValue.perform();
        if (division.checkingDivByZero(valueB)) {
            recordCalculatingResultDivByZero();
            return show();
        } else {
            double addResult = division.action(valueA, valueB);
            recordCalculatingResult(addResult, "The result of DIVISION operation --> ");
            return show();
        }
    }

    private int calculateMultiply() {
        EnterValue enterValue = new EnterValue();
        Multiply multiply = new Multiply();
        descriptionFirstValue();
        double valueA = enterValue.perform();
        descriptionSecondValue();
        double valueB = enterValue.perform();
        double addResult = multiply.action(valueA, valueB);
        recordCalculatingResult(addResult, "The result of MULTIPLY operation --> ");
        return show();
    }
}



