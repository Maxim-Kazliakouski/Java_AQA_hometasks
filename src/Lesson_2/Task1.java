package Lesson_2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("The 1st task: " + "Positive or negative, amount of numbers".toUpperCase());
        System.out.println("---------------------------------------");
        int a = 112123;
        if (a >= 0) {
            System.out.printf("The number a = %s is positive", a);
            System.out.println();
        } else System.out.println("The 'a' is negative");
        int amountOfNumbers = String.valueOf(a).length();
        System.out.println("In number a = " + a + " there is " + amountOfNumbers + " number(s)");

        System.out.println("---------------------------------------");
        System.out.println("The 2nd task: " + "Triangle".toUpperCase());
        System.out.println("---------------------------------------");
        int sideA = 5;
        int sideB = 7;
        int sideC = 3;
        if ((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideC + sideA) > sideB) {
            System.out.println("It's a right triangle");
        } else System.out.println("It's wrong triangle!!!");

        System.out.println("---------------------------------------");
        System.out.println("The 3rd task " + "operation with integer".toUpperCase());
        System.out.println("---------------------------------------");
        int aaa = 1;
        if (aaa >= 0) {
            aaa += 1;
            System.out.println("A is a positive and it value is " + aaa);
        }
        if (aaa < 0) {
            aaa -= 2;
            System.out.println("A is a negative and it value is " + aaa);
        }
        if (aaa == 0) {
            aaa = 10;
            System.out.println("A is a ZERO and it value was changed and now equals " + aaa);
        }
        System.out.println("---------------------------------------");
        System.out.println("The 4th task: " + "Amount of positive numbers".toUpperCase());
        System.out.println("---------------------------------------");
        int a1 = 10;
        int b1 = 20;
        int c1 = -5;
        int amountOfPositiveNumbers = 0;
        if (a1 > 0) {
            amountOfPositiveNumbers += 1;
            System.out.println("a1 = " + a1 + " is positive");
        }
        if (b1 > 0) {
            System.out.println("b1 = " + b1 + " is positive");
            amountOfPositiveNumbers += 1;
        }
        if (c1 > 0) {
            System.out.println("c1 = " + c1 + " is positive");
            amountOfPositiveNumbers += 1;
        } else System.out.println("c1 = " + c1 + " is negative");
        System.out.println("The amount of positive numbers are --> " + amountOfPositiveNumbers);

        System.out.println("---------------------------------------");
        System.out.println("The 5th task: " + "Amount of positive and negative numbers".toUpperCase());
        System.out.println("---------------------------------------");
        int aa1 = 10;
        int bb1 = 20;
        int cc1 = -5;
        int amountOfAllNumbers = 0;
        if (aa1 > 0 || aa1 < 0) {
            amountOfAllNumbers += 1;
//            System.out.println("aa1 is positive");
        }
        if (bb1 > 0 || bb1 < 0) {
//            System.out.println("bb1 is positive");
            amountOfAllNumbers += 1;
        }
        if (cc1 > 0 || cc1 < 0) {
//            System.out.println("cc1 is positive");
            amountOfAllNumbers += 1;
        }
        System.out.println("The amount of all numbers are --> " + amountOfAllNumbers);

        System.out.println("---------------------------------------");
        System.out.println("The 6th task: " + "The biggest number".toUpperCase());
        System.out.println("---------------------------------------");
        int firstNum = 5;
        int secondNum = 23;
        if (firstNum > secondNum) {
            System.out.println("The first number is more than second and equals: " + firstNum);
        } else if (firstNum == secondNum) {
            System.out.println("The first number equals second");
        } else System.out.println("The second numbers is more than first and equals: " + secondNum);

        System.out.println("---------------------------------------");
        System.out.println("The 7th task: " + "programmers".toUpperCase());
        System.out.println("---------------------------------------");
        for (int AmountOfProgrammers = 0; AmountOfProgrammers <= 101; AmountOfProgrammers++) {
            if (AmountOfProgrammers % 100 >= 11 && AmountOfProgrammers % 100 <= 14) {
                System.out.println(AmountOfProgrammers + " программистов");
            } else if (AmountOfProgrammers % 10 == 1) {
                System.out.println(AmountOfProgrammers + " программист");
            } else if (AmountOfProgrammers % 10 > 1 && AmountOfProgrammers % 10 < 5) {
                System.out.println(AmountOfProgrammers + " программиста");
            } else {
                System.out.println(AmountOfProgrammers + " программистов");
            }
        }
    }
}

