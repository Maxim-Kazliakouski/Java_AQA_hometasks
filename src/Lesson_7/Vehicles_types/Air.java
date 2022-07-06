package Lesson_7.Vehicles_types;

import Lesson_7.Vehicles_common.Vehicle;

public class Air extends Vehicle {
    public int wingSpan;
    public int minLengthOfFlyRoad;

    public Air(int horsePower, int maxSpeed, int weight, String model, int wingSpan, int lengthOfFlyRoad) {
        super(horsePower, maxSpeed, weight, model);
        this.wingSpan = wingSpan;
        this.minLengthOfFlyRoad = lengthOfFlyRoad;
    }
}
