package Lesson_3.Part_One;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("3rd task");
        System.out.println("-----------------------------");
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(99);
        }
        System.out.println("Array from 15 random values: ");
        for (int k = 0; k <= 15 - 1; k++) {
            System.out.print(array[k] + " ");
        }
        int amountOfEvenNumbers = 0;
        for (int k = 0; k <= 15 - 1; k++) {
            if (array[k] % 2 == 0) {
                amountOfEvenNumbers++;
            }
        }
        System.out.println();
        System.out.printf("The amount of even numbers: %s", amountOfEvenNumbers);
    }
}
