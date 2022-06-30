package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("3rd task");
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
        int mulOfFirstDiagonal = 1;
        int mulOfSecondDiagonal = 1;
        for (int i = 0, j = 0; i < size && j < size; i++, j++) {
            mulOfFirstDiagonal *= squareArray[i][j];
        }
        for (int i = size - 1, j = 0; i >= 0 && j < size; i--, j++) {
            mulOfSecondDiagonal *= squareArray[i][j];
        }
        System.out.println("The multiply of 1st diagonal --> " + mulOfFirstDiagonal);
        System.out.println("The multiply of 2nd diagonal --> " + mulOfSecondDiagonal);
        if (mulOfFirstDiagonal > mulOfSecondDiagonal){
            System.out.printf("The 1st diagonal is greater than 2nd: %s > %s", mulOfFirstDiagonal, mulOfSecondDiagonal);
        }
        else if (mulOfSecondDiagonal > mulOfFirstDiagonal){
            System.out.printf("The 2nd diagonal is greater than 1st: %s > %s", mulOfSecondDiagonal, mulOfFirstDiagonal);
        }
        else System.out.printf("The diagonals are equal: %s = %s", mulOfFirstDiagonal, mulOfSecondDiagonal);
    }
}
