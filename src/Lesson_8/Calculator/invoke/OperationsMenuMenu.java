package Lesson_8.Calculator.invoke;

import Lesson_8.Calculator.enteringValues.EnterFirstValue;
import Lesson_8.Calculator.enteringValues.EnterSecondValue;
import Lesson_8.Calculator.mathOperations.Addition;
import Lesson_8.Calculator.mathOperations.Division;
import Lesson_8.Calculator.mathOperations.Multiply;
import Lesson_8.Calculator.mathOperations.Subtraction;

public class OperationsMenuMenu extends Lesson_8.Calculator.menuDescription.OperationsMenu {
    public int invoke() {
        EnterFirstValue enterFirstValue = new EnterFirstValue();
        EnterSecondValue enterSecondValue = new EnterSecondValue();
        int choice = show();
        while (choice != 0 && choice != 5) {
            if (choice == 1) {
                Addition addition = new Addition();
                addition.action(enterFirstValue.perform(), enterSecondValue.perform());
                choice = show();
            }
            if (choice == 2) {
                Subtraction subtraction = new Subtraction();
                subtraction.action(enterFirstValue.perform(), enterSecondValue.perform());
                choice = show();
            }
            if (choice == 3) {
                Division division = new Division();
                division.action(enterFirstValue.perform(), enterSecondValue.perform());
                choice = show();
            }
            if (choice == 4) {
                Multiply multiply = new Multiply();
                multiply.action(enterFirstValue.perform(), enterSecondValue.perform());
                choice = show();
            }
        }
        return choice;
    }
}
