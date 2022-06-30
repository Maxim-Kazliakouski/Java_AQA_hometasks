package Lesson_3.Part_Two;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("The 6th task");
        System.out.println("------------------------------");
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        // printing array
        System.out.println("Created array:");
        ArrayList<Integer> unicArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int comparedElement;
        int i, k;
        for (i = 0; i < array.length; i++) {
            comparedElement = array[i];
            for (k = 0; k < array.length; k++) {
                if (i != k && comparedElement == array[k]) {
                    // adding repeatable elements in array
                    unicArray.add(array[k]);
                }
            }
        }
        System.out.println();
        HashSet<Integer> integerHashSet = new HashSet<>(unicArray);
        if (integerHashSet.size() != 0) {
            System.out.println("Not all elements are different!");
            System.out.println("There are repeatable elements in array: ");
            // printing unic elements in array
            for (Integer m : integerHashSet) {
                System.out.println(m);
            }
        } else System.out.println("All elements are different!");

    }
}
