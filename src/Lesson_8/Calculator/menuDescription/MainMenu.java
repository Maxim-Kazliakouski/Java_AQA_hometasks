package Lesson_8.Calculator.menuDescription;

import Lesson_8.Calculator.enteringValues.EnterChoice;

public class MainMenu extends EnterChoice {

    public int show() {
        int mainMenuChoice = 0;
        while (mainMenuChoice != 1
                && mainMenuChoice != 2
                && mainMenuChoice != 3) {
            descriptionMainMenu();
            mainMenuChoice = performChoice();
            if (mainMenuChoice == 0) {
                descriptionExit();
                break;
            } else if (mainMenuChoice < 0 || mainMenuChoice > 3) {
                System.out.println("--------------------------");
                System.out.println("Enter the number of your choice from '0' to '3'");
                System.out.printf("You've entered --> %s%n", mainMenuChoice);
            }
        }
        return mainMenuChoice;
    }

    private void descriptionMainMenu() {
        System.out.println("---------------------------");
        System.out.println("Please, select menu item: ");
        System.out.println("---------------------------");
        System.out.println("1. Choose the operations");
        System.out.println("2. Instructions");
        System.out.println("3. Results of calculating");
        System.out.println("0. Exit from the app");
    }

    private void descriptionExit() {
        System.out.println("---------------------------");
        System.out.println("Exit from the calculator...");
        System.out.println("---------------------------");
    }
}