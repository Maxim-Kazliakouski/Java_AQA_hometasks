package Lesson_7.Vehicles_objects;

import Lesson_7.Vehicles_classes.CivilAirplane;

public class Boing {
    public static void main(String[] args) {
        CivilAirplane boing = new CivilAirplane(11000, 850, 41140, "Boing 737",
                34, 1630, 349, true);
        boing.pintInfoAboutCivilAirplane();
        boing.conversionToKilowatts();
        boing.airplaneLoading(300);
    }
}
