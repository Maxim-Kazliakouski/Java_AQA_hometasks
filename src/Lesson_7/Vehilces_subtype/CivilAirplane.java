package Lesson_7.Vehilces_subtype;

import Lesson_7.Vehicles_types.Air;

public class CivilAirplane extends Air {
    int passengers;
    boolean businessClass;


    public CivilAirplane(int horsePower, int maxSpeed, int weight, String model,
                         int wingSpan, int minLengthOfFlyRoad, int passengers, boolean businessClass) {
        super(horsePower, maxSpeed, weight, model, wingSpan, minLengthOfFlyRoad);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public void pintInfoAboutCivilAirplane() {
        System.out.printf("Brief info about %s:%n", model);
        System.out.println("------------------------------------");
        System.out.printf("Power engine --> %s hP%n", horsePower);
        System.out.printf("Max speed --> %s km/h%n", maxSpeed);
        System.out.printf("Weight --> %s kg%n", weight);
        System.out.printf("Model --> %s%n", model);
        System.out.printf("Wingspan --> %s m%n", wingSpan);
        System.out.printf("Length of fly road --> %s m%n", minLengthOfFlyRoad);
        System.out.printf("Amount of passengers --> %s%n", passengers);
        System.out.printf("Is there Business Class --> %s%n", businessClass);
        System.out.println("------------------------------------");
    }

    public void airplaneLoading(int expectedAmountOfPassengers) {
        if (expectedAmountOfPassengers > passengers) {
            System.out.println("You need a little bit bigger plane :(");
        } else if (expectedAmountOfPassengers == passengers) {
            System.out.println("You have fully loaded the plane :)");
        } else if (expectedAmountOfPassengers < passengers && expectedAmountOfPassengers > 0) {
            System.out.println("The plane is loaded!");
        } else if (expectedAmountOfPassengers < 0) {
            System.out.println("You can't load negative amount of passengers...");
        } else if (expectedAmountOfPassengers == 0) {
            System.out.println("You didn't load the plane!");
        }
    }
}
