package Lesson_7.Vehicles_classes;

import java.util.Scanner;

public class MilitaryAirplane extends Air {
    boolean catapultSystem;
    int amountOfRockets;

    public MilitaryAirplane(int horsePower, int maxSpeed, int weight, String model,
                            int wingSpan, int lengthOfFlyRoad, boolean catapultSystem, int amountOfRockets) {
        super(horsePower, maxSpeed, weight, model, wingSpan, lengthOfFlyRoad);
        this.catapultSystem = catapultSystem;
        this.amountOfRockets = amountOfRockets;
    }

    public void pintInfoAboutMilitaryAirplane() {
        System.out.printf("Brief info about %s:%n", model);
        System.out.println("------------------------------------");
        System.out.printf("Power engine --> %s hP%n", horsePower);
        System.out.printf("Max speed --> %s km/h%n", maxSpeed);
        System.out.printf("Weight --> %s kg%n", weight);
        System.out.printf("Model --> %s%n", model);
        System.out.printf("Wingspan --> %s m%n", wingSpan);
        System.out.printf("Length of fly road --> %s m%n", lengthOfFlyRoad);
        System.out.printf("Is there catapult system --> %s%n", catapultSystem);
        System.out.printf("Amount of rockets --> %s%n", amountOfRockets);
        System.out.println("------------------------------------");
    }

    public void shoot() {
        System.out.println("The rocket has been launch!");
        amountOfRockets--;
        if (amountOfRockets > 0) {
            System.out.println("Left rockets: " + amountOfRockets);
        } else {
            System.out.println("There is no more rockets...");
            System.out.println("------------------------------------");
        }
    }

    public void shootWithRequest() {
        int Rockets = amountOfRockets;
        String stopShooting = "YES";
        Scanner input = new Scanner(System.in);

        while (!stopShooting.equals("NO") & Rockets >= 0) {
            System.out.println("The rocket has been launch!");
            Rockets--;
            if (Rockets == 0) {
                System.out.println("There is no more rockets...");
                System.out.println("------------------------------------");
                break;
            }
            System.out.println("Left rockets: " + Rockets);
            System.out.printf("Do you want to launch one more?%nPlease enter Yes or No: ");
            stopShooting = input.nextLine().toUpperCase();
            System.out.println("------------------------------------");
            if (stopShooting.equals("NO")) {
                System.out.println("Stop shooting...");
                System.out.println("------------------------------------");
            }
        }
    }

    public void catapult() {
        if (catapultSystem) {
            System.out.println("Catapulting pass successfully!!!");
            System.out.println("------------------------------------");
        } else {
            System.out.println("Unfortunately, there is no catapult system...");
            System.out.println("------------------------------------");
        }
    }
}