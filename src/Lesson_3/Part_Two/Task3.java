package Lesson_3.Part_Two;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("The 3rd task");
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
        int numberAfter = 5;
        double amountOfNumberMoreThanNumberAfter = 0;
        double sumOfElementsMoreThanNumberAfter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numberAfter) {
                amountOfNumberMoreThanNumberAfter++;
                sumOfElementsMoreThanNumberAfter += array[i];
            }
        }
        if (sumOfElementsMoreThanNumberAfter != 0) {
            System.out.printf("%nThe amount of number more than %s --> %s", numberAfter, amountOfNumberMoreThanNumberAfter);
            System.out.println();
            double avg = (sumOfElementsMoreThanNumberAfter / amountOfNumberMoreThanNumberAfter);
            String aroundAVG = String.format("%.1f", avg);
            System.out.printf("The sum of numbers more than %s equals --> %s", numberAfter, sumOfElementsMoreThanNumberAfter);
            System.out.printf("%nThe average sum of numbers that more than %s equals --> %s", numberAfter, aroundAVG);
        } else System.out.printf("%nThere are no numbers more than %s", numberAfter);
    }
}
