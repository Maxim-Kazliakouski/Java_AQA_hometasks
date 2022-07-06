package Lesson_7.Vehicles_types;

public class Vehicle {
    int horsePower;
    int maxSpeed;
    int weight;
    String model;

    public Vehicle(int power, int maxSpeed, int weight, String model) {
        this.horsePower = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void conversionToKilowatts(){
        double conversionHPtoKW = horsePower*0.74;
        System.out.printf("The power in kilowatts for %s is following --> %s kW%n", model, conversionHPtoKW);
        System.out.println("------------------------------------");
    }
}
