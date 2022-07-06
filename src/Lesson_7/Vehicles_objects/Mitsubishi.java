package Lesson_7.Vehicles_objects;

import Lesson_7.Vehicles_classes.Car;

public class Mitsubishi {
    public static void main(String[] args) {
        Car mitsubishi = new Car(170, 280,1800,
                "Mitsubishi Outlander", 4,10, "Crossover", 5);
        mitsubishi.pintInfoAboutCarLight();
        mitsubishi.conversionToKilowatts();
        mitsubishi.distanceWithMaxSpeed(30);
    }
}
