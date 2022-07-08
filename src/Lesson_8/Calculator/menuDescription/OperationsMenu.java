package Lesson_8.Calculator.menuDescription;

import Lesson_8.Calculator.enteringValues.EnterChoice;

public class OperationsMenu extends EnterChoice {
    public int show() {
        int choiceMenuWithOperations = 0;
        while (choiceMenuWithOperations != 1
                && choiceMenuWithOperations != 2
                && choiceMenuWithOperations != 3
                && choiceMenuWithOperations != 4
                && choiceMenuWithOperations != 5) {
            System.out.println("---------------------------");
            System.out.println("-----Choose operation:-----");
            System.out.println("---------------------------");
            System.out.println("1. Operation '+'");
            System.out.println("2. Operation '-'");
            System.out.println("3. Operation '/'");
            System.out.println("4. Operation '*'");
            System.out.println("5. Back to the main menu");
            System.out.println("0. Exit from the app");
            System.out.println("---------------------------");
            choiceMenuWithOperations = performChoice();
            if (choiceMenuWithOperations == 0) {
                System.out.println("---------------------------");
                System.out.println("Exit from the calculator...");
                System.out.println("---------------------------");
                break;
            }
            else if (choiceMenuWithOperations < 0 || choiceMenuWithOperations > 5){
                System.out.println("--------------------------");
                System.out.println("Enter the number of your choice from 0 till 5");
                System.out.printf("You've entered --> %s%n", choiceMenuWithOperations);
            }
        }
        return choiceMenuWithOperations;
    }
}
