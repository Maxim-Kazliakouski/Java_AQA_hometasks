package Lesson_8.Calculator.invoke;

import Lesson_8.Calculator.greetings.Greetings;
import Lesson_8.Calculator.menuDescription.MainMenu;


public class CalculatorMenu {
    public void show() {
        MainMenu mainMenu = new MainMenu();
        Instructions instructions = new Instructions();
        Greetings greetings = new Greetings();
        OperationsMenuMenu operationsMenu = new OperationsMenuMenu();
        greetings.show();
        int choice = mainMenu.show();
        while (choice != 0) {
            if (choice == 1) {
                choice = operationsMenu.invoke();
            }
            if (choice == 2) {
                choice = instructions.invoke();
            }
            if (choice == 5) {
                choice = mainMenu.show();
            }
        }
    }
}
