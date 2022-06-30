package Lesson_3.Part_One;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("10 task");
        System.out.println("-------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number more than 3: ");
        int number = input.nextInt();
        while (number < 3) {
            System.out.printf("You've enter number=%s less than 3, please enter number more than 3!!!%n", number);
            System.out.print("Enter number more than 3: ");
            number = input.nextInt();
        }
        int[] array = new int[number];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(number);
        }
        System.out.printf("The array from %s elements: ", number);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int amountOfEvenNumbersInFirstArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                amountOfEvenNumbersInFirstArray++;
            }
        }
        int[] array2 = new int[amountOfEvenNumbersInFirstArray];
        System.out.println();
        System.out.println("The amount of even numbers in array: " + amountOfEvenNumbersInFirstArray);
        if (amountOfEvenNumbersInFirstArray == 0) {
            System.out.println("There are no even numbers in 1st array!!!");
        } else {
            for (int i = 0, k = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    array2[k] = array[i];
                    k++;
                }
            }
        }
        System.out.println("The second array with even numbers");
        for (int k = 0; k < array2.length; k++) {
            System.out.print(array2[k] + " ");
        }
    }
}
