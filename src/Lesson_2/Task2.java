package Lesson_2;
import java.util.Formatter;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("The 1st task: " + "Everyday trainings".toUpperCase());
        System.out.println("---------------------------------------");
        int firstDayDistance = 10;
        double allDistance = 0;
        int day = 1;
        while (day <= 7) {
            allDistance += firstDayDistance + allDistance * 0.1;
            day++;
        }
        String roundResult = String.format("%.3f", allDistance);
        System.out.println("The whole distance in a week is: " + roundResult + " km");
        System.out.println("---------------------------------------");
        System.out.println("The 2nd task: "+ "Cells".toUpperCase());
        System.out.println("---------------------------------------");
        int splitTime = 3;
        int cellAmount = 1;
        while (splitTime <= 24) {
            cellAmount *= 2;
            System.out.println("The amount of cells in " + splitTime + " hours --> " + cellAmount);
            splitTime += 3;
        }
        System.out.println("---------------------------------------");
        System.out.println("The 3rd task: " + "sum of 2+4+8+16+...+256".toUpperCase());
        System.out.println("---------------------------------------");
        int number = 1;
        int sum = 0;
        while (number <= 256) {
            sum += number;
            number *= 2;
        }
        System.out.println("The whole sum of 2+4+8+16+...+256 is: " + sum);
        System.out.println("---------------------------------------");
        System.out.println("The 4th task: " + "A*B without multiple operation".toUpperCase());
        System.out.println("---------------------------------------");
        int a = 2;
        int b = 10;
        int Result = 0;
        for (int i = 1; i <= a; i++) {
            Result += b;
        }
        Formatter f = new Formatter();
        f.format("The result of multiplication a=%s and b=%s is %s", a, b, Result);
        System.out.println(f);
        System.out.println("---------------------------------------");
        System.out.println("The 5th task: " + "inches to centimeters".toUpperCase());
        System.out.println("---------------------------------------");
        double inch = 2.54;
        int interval = 1;
        while (interval <= 20) {
            Formatter f1 = new Formatter();
            double operate = interval * inch;
            f1.format("In %s inch's are %s cm", interval, operate);
            System.out.println(f1);
            interval++;
        }
        System.out.println("---------------------------------------");
        System.out.println("The 6th task: " + "even numbers from 2 to 100".toUpperCase());
        System.out.println("---------------------------------------");
        int EvenNumber = 2;
        while (EvenNumber <= 100) {
            if (EvenNumber % 2 == 0) {
                System.out.print(EvenNumber + " ");
            }
            EvenNumber++;
        }
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("The 7th task:" + "the sum of odd numbers till 99".toUpperCase());
        System.out.println("---------------------------------------");
        int OddNumber = 1;
        int SumOddNumber = 0;
        while (OddNumber < 100) {
            if (OddNumber % 2 != 0) {
                SumOddNumber += OddNumber;
            }
            OddNumber++;
        }
        System.out.printf("The sum odd numbers from 1 to 99 is %s", SumOddNumber);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("The 8th task: " + "***");
        System.out.println("---------------------------------------");
        String symbol = "*";
        int counter = 0;
        while (counter < 3) {
            System.out.println(symbol);
            symbol += "*";
            counter++;
            if (counter == 3) {
                System.out.println();
            }
        }
        int counter2 = 1;
        while (counter2 <= symbol.length()) {
            String substr1 = symbol.substring(counter2);
            System.out.println(substr1);
            counter2++;
        }
        System.out.println("---------------------------------------");
        System.out.println("The 9th task: " + "Febonachi numbers".toUpperCase());
        System.out.println("---------------------------------------");
        int first_number = 1;
        int second_number = 1;
        int rest_numbers;
        System.out.print(first_number + " " + second_number + " ");
        for (int i = 3; i <= 15; i++) {
            rest_numbers = first_number + second_number;
            System.out.print(rest_numbers + " ");
            first_number = second_number;
            second_number = rest_numbers;
        }
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("The 10th task " + "all positive dividers of integer".toUpperCase());
        System.out.println("---------------------------------------");
        int WholeNumber = 28;
        if (WholeNumber >= 0) {
            for (int i = 1; i <= WholeNumber; i++) {
                if (WholeNumber % i == 0) {
                    Formatter f2 = new Formatter();
                    f2.format("Divider of number %s --> %s", WholeNumber, i);
                    System.out.println(f2);
                }
            }
        } else
            System.out.println("Only positive dividers!!!");

        System.out.println("---------------------------------------");
        System.out.println("The 11th task " + "Simple or complicate number".toUpperCase());
        System.out.println("---------------------------------------");
        int SimpleOrNot = 11;
        System.out.println("Is the number " + SimpleOrNot + " complicate or simple?");
        Formatter f3 = new Formatter();
        if (SimpleOrNot % 1 == 0 && SimpleOrNot % SimpleOrNot == 0 && SimpleOrNot % 2 == 0) {
            f3.format("%s -- complicate number", SimpleOrNot);
            System.out.println(f3);
        } else {
            f3.format("%s -- simple number", SimpleOrNot);
            System.out.println(f3);
        }

        System.out.println("---------------------------------------");
        System.out.println("The 11th task: "+ "The numbers sum".toUpperCase());
        System.out.println("---------------------------------------");
        int Number = 7865;
        int NumbersSum = 0;
        String chislo_stroka = Integer.toString(Number);
        for (int i = 0; i < chislo_stroka.length(); i++) {
            char each_number = chislo_stroka.charAt(i);
            NumbersSum += Character.getNumericValue(each_number);
        }
        System.out.printf("The sum of number %s is --> %s", Number, NumbersSum);
    }
}


