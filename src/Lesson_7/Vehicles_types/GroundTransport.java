package Lesson_7.Vehicles_types;

public class GroundTransport extends Vehicle{
    int wheels;
    int fuelConsumption;

    public GroundTransport(int horsePower, int maxSpeed, int weight, String model, int wheels, int fuelConsumption) {
        super(horsePower, maxSpeed, weight, model);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
}
