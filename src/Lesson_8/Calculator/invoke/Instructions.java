package Lesson_8.Calculator.invoke;

import Lesson_8.Calculator.enteringValues.EnterChoice;

public class Instructions extends EnterChoice {
    public int invoke() {
        System.out.println("--------------------------");
            System.out.println("*** Calculate app was developed only for educational purposes");
            System.out.println("*** If you want to enter float number, please use ',' instead of '.'");
            System.out.println("*** For exiting from the app, enter '0'");
        return 5;
    }
}
