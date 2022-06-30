package Lesson_3.Part_One;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("8th task");
        System.out.println("---------------------------");
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        Random random = new Random();
        // creating first array
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(9);
        }
        System.out.println("First array");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        // creating second array
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(9);
        }
        System.out.println("Second array");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        // creating third array
        for (int i = 0; i < array3.length; i++) {
            if (array2[i] == 0) {
//                System.out.println("Division by ZERO");
                array3[i] = 0;
            } else {
                double elementFromFirstArray = array1[i];
                double elementFromSecondArray = array2[i];
                double res = elementFromFirstArray / elementFromSecondArray;
                array3[i] = res;
            }
        }
        System.out.println("Third array: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.printf("%.2f" + " ", array3[i]);
        }
        System.out.println();
        int amountOfWholeNumbers = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 1 == 0) {
                amountOfWholeNumbers++;
            }
        }
        System.out.printf("The amount of whole numbers in 3rd array is --> %s", amountOfWholeNumbers);
    }
}
