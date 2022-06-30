package Lesson_3.Part_Two;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("The 5th task");
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
        //changing second element
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println();
        System.out.println("New array with replacement each second element by zero: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
