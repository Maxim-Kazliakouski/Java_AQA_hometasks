package Lesson_9;

import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private int price;

// default constructor

    public Car() {

    }

    // constructor with parameters
    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    // getter and setters

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public void startCar() throws MyOwnException {
        Random random = new Random();
        if (random.nextInt(20) % 2 == 0) {
            throw new MyOwnException();
        } else {
            System.out.printf("The car %s has been started successfully!%n", this.model);
        }
    }
}
