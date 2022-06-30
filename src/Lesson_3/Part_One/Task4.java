package Lesson_3.Part_One;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("The 4th task");
        System.out.println("---------------------");
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println();
        System.out.println("Change for ZERO each element with odd index: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
