package Lesson_8.Calculator.invoke;

import Lesson_8.Calculator.DataBase;
import Lesson_8.Calculator.enteringValues.EnterValue;
import Lesson_8.Calculator.mathOperations.Addition;
import Lesson_8.Calculator.mathOperations.Division;
import Lesson_8.Calculator.mathOperations.Multiply;
import Lesson_8.Calculator.mathOperations.Subtraction;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OperationsMenu extends Lesson_8.Calculator.menuDescription.OperationsMenu implements DataBase {
    static int indexPosition = 0;
    static int indexPositionForAllHistory = 0;

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

    public void recordCalculatingResultDivByZeroToAllHistory() {
        allResults.add(indexPositionForAllHistory, indexPositionForAllHistory + 1 + ". " + "Division by ZERO!"
                + "\n" + gettingDate());
        indexPositionForAllHistory++;
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
        recordHistory(addResult, "The result of ADDITION operation --> ");
        recordToAllHistory(addResult, "The result of ADDITION operation --> ");
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
        recordHistory(addResult, "The result of SUBTRACTION operation --> ");
        recordToAllHistory(addResult, "The result of SUBTRACTION operation --> ");
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
            recordCalculatingResultDivByZeroToAllHistory();
            return show();
        } else {
            double addResult = division.action(valueA, valueB);
            recordHistory(addResult, "The result of DIVISION operation --> ");
            recordToAllHistory(addResult, "The result of DIVISION operation --> ");
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
        recordHistory(addResult, "The result of MULTIPLY operation --> ");
        recordToAllHistory(addResult, "The result of MULTIPLY operation --> ");
        return show();
    }

    public String gettingDate() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm:ss', and date: 'yyyy.MM.dd");
        return "Operation was performed at " + formatForDateNow.format(dateNow);
    }

    @Override
    public void recordHistory(double result, String typeOfOperation) {
        if (indexPosition >= resultsCalculate.length) {
            indexPosition = 0;
        }
        resultsCalculate[indexPosition] = indexPosition + 1 + ". " + typeOfOperation + result;
        indexPosition++;
    }

    @Override
    public void recordToAllHistory(double result, String typeOfOperation) {
        allResults.add(indexPositionForAllHistory, indexPositionForAllHistory + 1 + ". " + typeOfOperation
                + result + "\n" + gettingDate());
        indexPositionForAllHistory++;

    }

    @Override
    public void printHistory() {
    }

    @Override
    public void printAllHistory() {
    }
}



