package Lesson_3.Part_Two;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("The 7th task");
        System.out.println("------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter searching number from 1 to 10: ");
        int givenElement = input.nextInt();
        while (givenElement < 1 || givenElement > 10) {
            System.out.printf("You've enter number=%s not in interval from 1 to 10%n", givenElement);
            System.out.print("Please, enter searching number from 1 to 10: ");
            givenElement = input.nextInt();
        }
        int countGivenNumber = 0;
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        // printing array
        System.out.println("Created array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == givenElement) {
                countGivenNumber++;
            }
        }
        System.out.printf("%nThe number '%s' appears %s times", givenElement, countGivenNumber);
    }
}
