package Lesson_7.Vehicles_types;

public class Truck extends GroundTransport {
    int loadCapacity;


    public Truck(int horsePower, int maxSpeed, int weight, String model,
                 int wheels, int fuelConsumption, int loadCapacity) {
        super(horsePower, maxSpeed, weight, model, wheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void pintInfoAboutTruck() {
        System.out.printf("Brief info about %s:%n", model);
        System.out.println("------------------------------------");
        System.out.printf("Power engine --> %s hP%n", horsePower);
        System.out.printf("Max speed --> %s km/h%n", maxSpeed);
        System.out.printf("Weight --> %s kg%n", weight);
        System.out.printf("Model --> %s%n", model);
        System.out.printf("Amount of wheels --> %s%n", wheels);
        System.out.printf("Fuel consumption --> %s l/100km%n", fuelConsumption);
        System.out.printf("Load capacity of truck --> %s kg%n", loadCapacity);
        System.out.println("------------------------------------");

    }

    public void truckLoading(int loadingWeight) {
        if (loadingWeight > loadCapacity) {
            System.out.println("You need a little bit bigger truck :(");
        } else if (loadingWeight == loadCapacity) {
            System.out.println("You loaded truck exactly under the roof :)");
        } else if (loadingWeight < loadCapacity && loadingWeight > 0) {
            System.out.println("The truck is loaded!");
        } else if (loadingWeight < 0) {
            System.out.println("You can't load negative weight...");
        } else if (loadingWeight == 0) {
            System.out.println("You didn't load the truck!");
        }
    }
}
