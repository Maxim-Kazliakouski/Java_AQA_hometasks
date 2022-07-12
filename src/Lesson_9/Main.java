package Lesson_9;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200, 100000);
        try {
            car1.startCar();
        } catch (Exception e) {
            System.out.println("Fail, car - " + car1.getModel());
            e.printStackTrace();
        }
        Car car2 = new Car("Mercedes", 300, 150000);
        try {
            car2.startCar();
        } catch (Exception e) {
            System.out.println("Fail, car - " + car2.getModel());
            e.printStackTrace();
        }
        Car car3 = new Car("Audi", 220, 120000);
        try {
            car3.startCar();
        } catch (Exception e) {
            System.out.println("Fail, car - " + car3.getModel());
            e.printStackTrace();
        }
    }
}
