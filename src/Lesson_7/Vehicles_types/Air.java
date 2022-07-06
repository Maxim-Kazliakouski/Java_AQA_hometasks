package Lesson_7.Vehicles_types;

public class Air extends Vehicle{
    int wingSpan;
    int lengthOfFlyRoad;

    public Air(int horsePower, int maxSpeed, int weight, String model, int wingSpan, int lengthOfFlyRoad) {
        super(horsePower, maxSpeed, weight, model);
        this.wingSpan = wingSpan;
        this.lengthOfFlyRoad = lengthOfFlyRoad;
    }
}
