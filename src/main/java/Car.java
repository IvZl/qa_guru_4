public class Car {
    String brand;
    String model;
    int yearOfCreation;
    int mileage;
    int enginePower;
    boolean smartCar;

    public void startTheEngine () {
        if (smartCar) {
            System.out.println("AI: The engine has been started");
        }
        System.out.println("Engine of " + brand + " " + model + ": Tr-tr-tr");
        System.out.println();
    }

    public void characteristics() {
        System.out.println("Company: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Date of creation: " + yearOfCreation);
        System.out.println("Mileage(km): " + mileage);
        System.out.println("Horsepower: " + enginePower);
        System.out.println("Smart assistant system: " + smartCar);
        System.out.println();
    }
}
