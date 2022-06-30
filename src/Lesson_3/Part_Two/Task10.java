package Lesson_3.Part_Two;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("The 10th task");
        System.out.println("------------------------------");
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
        int maxValue = array[0];
        int indexOfMaxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                indexOfMaxValue = i;
            }
        }
        System.out.println();
        int firstValue = array[0];
        array[0] = maxValue;
        array[indexOfMaxValue] = firstValue;
        System.out.printf("The '%s' max value with index '%s' has been replaced for '%s' with index '0'",
                maxValue, indexOfMaxValue, firstValue);
        System.out.println();
        System.out.println("New array with replacement:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
