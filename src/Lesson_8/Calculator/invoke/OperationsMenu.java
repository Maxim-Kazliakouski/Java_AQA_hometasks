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
        EnterValue enterValue = new EnterValue();
        int choice = show();
        while (choice != 0 && choice != 5) {
            if (choice == 1) {
                Addition addition = new Addition();
                descriptionFirstValue();
                double valueA = enterValue.perform();
                descriptionSecondValue();
                double valueB = enterValue.perform();
                double addResult = addition.action(valueA, valueB);
                recordCalculatingResult(addResult, "The result of ADDITION operation --> ");
                choice = show();
            }
            if (choice == 2) {
                Subtraction subtraction = new Subtraction();
                descriptionFirstValue();
                double valueA = enterValue.perform();
                descriptionSecondValue();
                double valueB = enterValue.perform();
                double addResult = subtraction.action(valueA, valueB);
                recordCalculatingResult(addResult, "The result of SUBTRACTION operation --> ");
                choice = show();
            }
            if (choice == 3) {
                Division division = new Division();
                descriptionFirstValue();
                double valueA = enterValue.perform();
                descriptionSecondValue();
                double valueB = enterValue.perform();
                if (division.checkingDivByZero(valueB)) {
                    recordCalculatingResultDivByZero();
                    choice = show();
                } else
                {
                    double addResult = division.action(valueA, valueB);
                    recordCalculatingResult(addResult, "The result of DIVISION operation --> ");
                    choice = show();
                }
            }
            if (choice == 4) {
                Multiply multiply = new Multiply();
                descriptionFirstValue();
                double valueA = enterValue.perform();
                descriptionSecondValue();
                double valueB = enterValue.perform();
                double addResult = multiply.action(valueA, valueB);
                recordCalculatingResult(addResult, "The result of MULTIPLY operation --> ");
                choice = show();
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
        resultsCalculate[indexPosition] = indexPosition + 1 +". " + operation + String.valueOf(calcResult);
        indexPosition++;
    }

    public void
    recordCalculatingResultDivByZero() {
        if (indexPosition >= resultsCalculate.length) {
            indexPosition = 0;
        }
        resultsCalculate[indexPosition] = indexPosition + 1 +". " + "Division by ZERO!";
        indexPosition++;
    }
}
