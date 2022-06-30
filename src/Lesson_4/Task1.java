package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("1st task");
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
        int sumMainDiagonal = 0;
        for (int i = 0, j = 0; i < size && j < size; i++, j++) {
            if (squareArray[i][j]%2 == 0) {
                sumMainDiagonal += squareArray[i][j];
            }
        }
        System.out.println("The sum of even elements on main diagonal --> " + sumMainDiagonal);
    }
}
