package Lesson_3.Part_One;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("1st task");
        System.out.println("-----------------------------");
        int amountOfDividers = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                amountOfDividers++;
            }
        }
//        System.out.printf("The number of dividers from 2 to 20 --> %s", amountDividers);
        int arraySize = amountOfDividers;
        int[] array = new int[arraySize];
        int i = 0;
        int b = 2;
        while (i < arraySize) {
            array[i] = b;
            b += 2;
            i++;
        }
        System.out.print("Massive from 2 to 20 in string:");
        System.out.println();
        for (int k = 0; k <= arraySize - 1; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();
        System.out.println("Massive from 2 to 20 in column:");
        for (int k = 0; k <= arraySize - 1; k++) {
            System.out.println(array[k]);
        }
    }
}
