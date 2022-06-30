package Lesson_3.Part_One;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("6th task");
        System.out.println("---------------------");
        int[] array = new int[4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        int increasing = 0;
        for (int i = 0; i < 4 - 1; i++) {
            if (i > 3) {
                break;
            }
            if (array[i + 1] > array[i]) {
                increasing++;
            }
        }
        System.out.println();
        if (increasing == 3) {
            System.out.println("The statement increasing");
        } else System.out.println("The statement not strictly increasing!!!");
    }
}
