package Lesson_7.Vehicles;

import Lesson_7.Vehicles_types.Truck;

public class Scania {
    public static void main(String[] args) {
        Truck scania = new Truck(500, 130, 18000, "Scania R420", 6,
                24, 30000);
        scania.pintInfoAboutTruck();
        scania.conversionToKilowatts();
        scania.truckLoading(10000);
    }
}
