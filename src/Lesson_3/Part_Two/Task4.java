package Lesson_3.Part_Two;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("The 4rd task");
        System.out.println("------------------------------");
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        // printing array
        System.out.println("Created array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int arrayMin = array[0];
        // searching the lowest element in array
        for (int i = 0; i < array.length; i++) {
            if (arrayMin >= array[i] && array[i] % 2 != 0) {
                arrayMin = array[i];
            }
        }
        System.out.println();
        System.out.println("Min odd element in array --> " + arrayMin);
    }
}
