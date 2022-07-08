package Lesson_8.Calculator.menuDescription;

import Lesson_8.Calculator.enteringValues.EnterChoice;

public class MainMenu extends EnterChoice {

    public int show() {
        int mainMenuChoice = 0;
        while (mainMenuChoice != 1
                && mainMenuChoice != 2) {
            System.out.println("---------------------------");
            System.out.println("Please, select menu item: ");
            System.out.println("---------------------------");
            System.out.println("1. Choose the operations");
            System.out.println("2. Instructions");
            System.out.println("0. Exit from the app");
            mainMenuChoice = performChoice();
            if (mainMenuChoice == 0) {
                System.out.println("---------------------------");
                System.out.println("Exit from the calculator...");
                System.out.println("---------------------------");
                break;
            } else if (mainMenuChoice < 0 || mainMenuChoice > 2) {
                System.out.println("--------------------------");
                System.out.println("Enter the number of your choice from '0' to '2'");
                System.out.printf("You've entered --> %s%n", mainMenuChoice);
            }
        }
        return mainMenuChoice;
    }
}