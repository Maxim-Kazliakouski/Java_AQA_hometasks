package Lesson_3.Part_One;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("The 7th task");
        System.out.println("---------------------------");
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }
        int maxValue = array[0];
        int maxIndex = 0;
        System.out.println();
        for (int i = 0; i < 12; i++) {
            if (maxValue <= array[i]) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println("The max element in array is --> " + maxValue);
        System.out.println("The max last entering of index is --> " + maxIndex);
    }
}
