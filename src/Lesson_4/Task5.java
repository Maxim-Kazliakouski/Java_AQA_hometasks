package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("5th task");
        System.out.println("--------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter size of square matrix: ");
        int size = input.nextInt();
        int[][] squareArray = new int[size][size];
        Random random = new Random();
        System.out.println("Printing square matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squareArray[i][j] = random.nextInt(50);
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = squareArray[i][j];
                squareArray[i][j] = squareArray[j][i];
                squareArray[j][i] = temp;
            }
        }
        System.out.println("New square matrix with changing strings for column:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
