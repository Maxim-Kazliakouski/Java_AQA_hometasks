package Lesson_3.Part_Two;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("The 8th task");
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
        int firstMaxValue = array[0];
        int secondMaxValue = array[1];
        for (int i = 0; i < array.length; i++) {
            if (firstMaxValue < array[i]) {
                secondMaxValue = firstMaxValue;
                firstMaxValue = array[i];
            } else if (array[i] > secondMaxValue) {
                if (array[i] != firstMaxValue) {
                    secondMaxValue = array[i];
                }
            }
        }
        System.out.println();
        System.out.println("The FIRST max value is: " + firstMaxValue);
        System.out.println("The SECOND max value is: " + secondMaxValue);
    }
}
