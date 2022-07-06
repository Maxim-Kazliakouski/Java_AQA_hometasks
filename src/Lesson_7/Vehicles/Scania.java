package Lesson_7.Vehicles;

import Lesson_7.Vehilces_subtype.Truck;

public class Scania {
    public static void main(String[] args) {
        Truck scania = new Truck(500, 130, 18000, "Scania R420", 6,
                24, 30);
        scania.pintInfoAboutTruck();
        scania.conversionToKilowatts();
        scania.truckLoading(10);
    }
}
