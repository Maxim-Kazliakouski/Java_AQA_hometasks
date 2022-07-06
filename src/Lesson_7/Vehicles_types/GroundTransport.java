package Lesson_7.Vehicles_types;

import Lesson_7.Vehicles_common.Vehicle;

public class GroundTransport extends Vehicle {
    public int wheels;
    public int fuelConsumption;

    public GroundTransport(int horsePower, int maxSpeed, int weight, String model, int wheels, int fuelConsumption) {
        super(horsePower, maxSpeed, weight, model);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
}
