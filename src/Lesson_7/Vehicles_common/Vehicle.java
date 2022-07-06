package Lesson_7.Vehicles_common;

public class Vehicle {
    public int horsePower;
    public int maxSpeed;
    public int weight;
    public String model;

    public Vehicle(int power, int maxSpeed, int weight, String model) {
        this.horsePower = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }
    public void conversionToKilowatts(){
        double conversionHPtoKW = horsePower*0.74;
        System.out.printf("The power in kilowatts for %s is following --> %s kW%n", model, conversionHPtoKW);
        System.out.println("------------------------------------");
    }
}
