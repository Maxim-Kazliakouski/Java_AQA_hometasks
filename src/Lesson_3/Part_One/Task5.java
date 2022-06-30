package Lesson_3.Part_One;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("The 5th task");
        System.out.println("---------------------");
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random random = new Random();
        System.out.println("The first array: ");
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(15);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("The second array: ");
        for (int i = 0; i < 5; i++) {
            array2[i] = random.nextInt(15);
            System.out.print(array2[i] + " ");
        }
        double sumFirstArray = 0;
        double sumSecondArray = 0;
        System.out.println();
        System.out.print("The average sum for 1st array: ");
        for (int i = 0; i < 5; i++) {
            sumFirstArray += array1[i];
        }
        System.out.println(sumFirstArray / 5);
        System.out.print("The average sum for 2nd array: ");
        for (int i = 0; i < 5; i++) {
            sumSecondArray += array2[i];
        }
        System.out.println(sumSecondArray / 5);
        if (sumFirstArray > sumSecondArray) {
            System.out.println("The sum of 1st array is greater than 2nd");
        } else if (sumSecondArray > sumFirstArray) {
            System.out.println("The sum of 2nd array is greater than 1st");
        } else System.out.println("The sums of 2 arrays are equal");
    }
}
