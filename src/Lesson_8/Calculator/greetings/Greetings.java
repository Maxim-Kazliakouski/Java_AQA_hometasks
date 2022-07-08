package Lesson_8.Calculator.greetings;

import java.util.Scanner;

public class Greetings {
    public void show(){
        System.out.println("---------------------------");
        System.out.println("---------CALCULATOR--------");
        System.out.println("---------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
