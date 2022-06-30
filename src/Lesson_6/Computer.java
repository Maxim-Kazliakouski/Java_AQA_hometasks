package Lesson_6;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String name;
    String cpu;
    int ram;
    int hdd;
    int resourceOfTurnOnOff;
    int successfulTurnOnOff;
    int unsuccessfulTurnOnOff;

    Computer(String name, String cpu, int ram, int hdd, int resourceOfTurnOnOff) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resourceOfTurnOnOff = resourceOfTurnOnOff;
    }

    public void printPCInfo() {
        System.out.println("Parameters of PC: ");
        System.out.println("--------------------------------");
        System.out.printf("NAME --> %s%nRAM --> %s%nCPU --> %s%nHDD --> %s%n" +
                "Amount of cycles turn on / turn off --> %s%n", name, ram, cpu, hdd, resourceOfTurnOnOff);
        System.out.println("--------------------------------");
    }

    public void turnOn(String name) {
        System.out.println("The attempt to TURN ON PC");
        if (this.unsuccessfulTurnOnOff == 1) {
            System.out.printf("The %s has been broken, and there is no possibility to TURN ON it!!!%n", name);
            System.out.println("--------------------------------");
        } else if (this.resourceOfTurnOnOff == 0) {
            System.out.printf("The %s has been broken, as working resource exhausted!!!%n", name);
            System.out.println("--------------------------------");
        } else {
            int number;
            Random random = new Random();
            int randomValue = random.nextInt(2);
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter number 1 or 0: ");
            number = input.nextInt();
            while (number != 0 && number != 1) {
                System.out.println("You enter wrong info, enter number 1 or 0: ");
                number = input.nextInt();
            }
            if (number == randomValue) {
                System.out.printf("The %s was TURNED ON SUCCESSFULLY%n", name);
                System.out.println("--------------------------------");
                this.successfulTurnOnOff++;
            } else {
                System.out.printf("The %s was TURNED ON UNSUCCESSFULLY, ERROR!!!%n", name);
                System.out.println("--------------------------------");
                this.unsuccessfulTurnOnOff++;
            }
            this.resourceOfTurnOnOff--;
        }

    }

    public void turnOff(String name) {
        System.out.println("The attempt to TURN OFF PC");
        if (this.unsuccessfulTurnOnOff == 1) {
            System.out.printf("The %s has been broken, and there is no possibility to TURN OFF it!!!%n", name);
            System.out.println("--------------------------------");
        } else if (this.resourceOfTurnOnOff == 0) {
            System.out.printf("The %s has been broken, as working resource exhausted!!!%n", name);
            System.out.println("--------------------------------");
        } else {
            int number;
            Random random = new Random();
            int randomValue = random.nextInt(2);
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter number 1 or 0: ");
            number = input.nextInt();
            while (number != 0 && number != 1) {
                System.out.println("You enter wrong info, enter number 1 or 0: ");
                number = input.nextInt();
            }
            if (number == randomValue) {
                System.out.printf("The %s was TURNED OFF SUCCESSFULLY%n", name);
                System.out.println("--------------------------------");
                this.successfulTurnOnOff++;
            } else {
                System.out.printf("The %s was TURNED OFF UNSUCCESSFULLY, ERROR!!!%n", name);
                System.out.println("--------------------------------");
                this.unsuccessfulTurnOnOff++;
            }
            this.resourceOfTurnOnOff--;
        }
    }

    public static void main(String[] args) {
        Computer notebook = new Computer("MacbookPro", "intel", 32, 256, 2);
        notebook.printPCInfo();
        notebook.turnOff(notebook.name);
        notebook.turnOn(notebook.name);
        notebook.turnOff(notebook.name);
    }
}
