package Lesson_3.Part_Two;

import java.util.ArrayList;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("The 9th task");
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
        ArrayList<Integer> oddArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                oddArray.add(array[i]);
            }
        }
        System.out.println();
        System.out.println("The array with even indexes of elements:");
        for (int i = 0; i < oddArray.size(); i++) {
            System.out.print(oddArray.get(i) + " ");
        }
        System.out.println();
        System.out.print("The lowest element: ");
        int min = oddArray.get(0);
        for (int i = 0; i < oddArray.size(); i++) {
            if (min > oddArray.get(i)) {
                min = oddArray.get(i);
            }
        }
        System.out.println(min);
    }
}
