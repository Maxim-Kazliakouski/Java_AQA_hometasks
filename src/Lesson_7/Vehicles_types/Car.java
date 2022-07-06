package Lesson_7.Vehicles_types;

public class Car extends GroundTransport {
    String bodyType;
    int passengers;


    public Car(int horsePower, int maxSpeed, int weight, String model,
               int wheels, int fuelConsumption, String bodyType, int passengers) {
        super(horsePower, maxSpeed, weight, model, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    public void pintInfoAboutCarLight() {
        System.out.printf("Brief info about %s:%n", model);
        System.out.println("------------------------------------");
        System.out.printf("Power engine --> %s hP%n", horsePower);
        System.out.printf("Max speed --> %s km/h%n", maxSpeed);
        System.out.printf("Weight --> %s kg%n", weight);
        System.out.printf("Model --> %s%n", model);
        System.out.printf("Amount of wheels --> %s%n", wheels);
        System.out.printf("Fuel consumption --> %s l/100km%n", fuelConsumption);
        System.out.printf("The body --> %s%n", bodyType);
        System.out.printf("Amount of passengers --> %s%n", passengers);
        System.out.println("------------------------------------");
    }

    private double fuelConsumptionForDistance(double distance) {
        return distance / this.fuelConsumption;
    }

    public void distanceWithMaxSpeed(int minutes) {
        double convToHours = minutes / 60.0;
        String hours = String.format("%.1f", convToHours);
        double distance = convToHours * maxSpeed;
        String roundDistance = String.format("%.1f", distance);
        double fuelCon = fuelConsumptionForDistance(distance);
        String roundFuelCon = String.format("%.1f", fuelCon);
        System.out.printf("For time %s hour(s) the car %s moves with max speed %s km/h," +
                        " passes %s km and spend %s liter(s) of fuel",
                hours, model, maxSpeed, roundDistance, roundFuelCon);
    }
}
