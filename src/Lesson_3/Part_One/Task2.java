package Lesson_3.Part_One;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("2nd task");
        System.out.println("-----------------------------");
        int amountOfDividers = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                amountOfDividers++;
            }
        }
        int a = 1;
        int arraySize = amountOfDividers;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = a;
            a = a + 2;
        }
        System.out.println("Array from 1 to 99: ");
        for (int k = 0; k <= arraySize - 1; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.printf("%nArray from 1 to 99 REVERSE: ");
        System.out.println();
        for (int k = arraySize - 1; k >= 0; k--) {
            System.out.print(array[k] + " ");
        }
    }
}
