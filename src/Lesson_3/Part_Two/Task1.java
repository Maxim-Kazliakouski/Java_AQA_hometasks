package Lesson_3.Part_Two;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("The 1st task");
        System.out.println("------------------------------");
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("The array from 10 elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int amountOfNumbersDivThree = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 3 == 0) {
                amountOfNumbersDivThree++;
            }
        }
        int[] array2 = new int[amountOfNumbersDivThree];
        if (amountOfNumbersDivThree == 0) {
            System.out.println("There is no numbers in array that divider by 3");
        } else {
            for (int j = 0, k = 0; j < array.length; j++) {
                if (array[j] != 0 && array[j] % 3 == 0) {
                    array2[k] = array[j];
                    k++;
                }
            }
        }
        int mulOfNumbersDivThree = 1;
        System.out.println();
        if (amountOfNumbersDivThree != 0) {
            System.out.println("The list of numbers that divide on 3:");
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
            System.out.println();
            System.out.println("Multiply numbers that are divisible by 3:");
            for (int i = 0; i < array2.length; i++) {
                mulOfNumbersDivThree *= array2[i];
            }
        }
        System.out.println(mulOfNumbersDivThree);
    }
}
