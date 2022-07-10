package Lesson_8.Calculator.invoke;

import Lesson_8.Calculator.greetings.Greetings;
import Lesson_8.Calculator.menuDescription.MainMenu;


public class CalculatorMenu {
    public void show() {
        MainMenu mainMenu = new MainMenu();
        Instructions instructions = new Instructions();
        Greetings greetings = new Greetings();
        OperationsMenu operationsMenu = new OperationsMenu();
        CalculateResults calculateResults = new CalculateResults();
        greetings.show();
        int choice = mainMenu.show();
        while (choice != 0) {
            if (choice == 1) {
                choice = operationsMenu.invoke();
            }
            if (choice == 2) {
                choice = instructions.invoke();
            }
            if (choice == 3) {
                calculateResults.invokeResults();
                choice = 5;
            }
            if (choice == 5) {
                choice = mainMenu.show();
            }
        }
    }
}
