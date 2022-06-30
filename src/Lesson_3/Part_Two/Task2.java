package Lesson_3.Part_Two;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("The 2nd task");
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
        double sum = 0;
        int amountOfOddElements = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                amountOfOddElements++;
                sum += array[i];
            }
        }
        System.out.printf("The sum of element with odd indexes: %s", sum);
        System.out.println();
        System.out.printf("The amount of numbers with odd indexes: %s", amountOfOddElements);
        System.out.println();
        System.out.printf("The average sum of element with odd indexes: %s", sum / amountOfOddElements);
    }
}
