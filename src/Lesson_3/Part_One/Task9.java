package Lesson_3.Part_One;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("9th task");
        System.out.println("-------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter even number from 2 to 12: ");
        int evenNumber = input.nextInt();
        while (evenNumber % 2 != 0) {
            System.out.println("You've enter odd number, please try again and enter odd!!!");
            System.out.print("Enter even number from 2 to 12: ");
            evenNumber = input.nextInt();
        }
        Random random = new Random();
        int[] array = new int[evenNumber];
        for (int i = 0; i < evenNumber; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.printf("Array from %s elements: ", evenNumber);
        System.out.println();
        // printing array:
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int sumLeftPartOfArray = 0;
        int sumRightPartOfArray = 0;
        // calculating the left part of array
        for (int i = 0; i < (array.length) / 2; i++) {
            sumLeftPartOfArray += array[i];
        }
        System.out.println();
        System.out.printf("The sum of left part is --> %s", sumLeftPartOfArray);
        // calculating the right part of array
        for (int i = (array.length) / 2; i < array.length; i++) {
            sumRightPartOfArray += array[i];
        }
        System.out.println();
        System.out.printf("The sum of right part is --> %s", sumRightPartOfArray);
        System.out.println();
        if (sumLeftPartOfArray > sumRightPartOfArray) {
            System.out.printf("The left part of array bigger than right part: %s > %s", sumLeftPartOfArray, sumRightPartOfArray);
            System.out.println();

        } else if (sumRightPartOfArray > sumLeftPartOfArray) {
            System.out.printf("The right part of array bigger than left part: %s > %s", sumRightPartOfArray, sumLeftPartOfArray);
            System.out.println();
        } else {
            System.out.printf("The array's parts are equal: %s = %s", sumLeftPartOfArray, sumRightPartOfArray);
            System.out.println();
        }
    }
}
