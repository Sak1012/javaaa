class Vehicle {
    private String name;
    private int wheels;
    private int maxSpeed;

    public Vehicle(String name, int wheels, int maxSpeed) {
        this.name = name;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
    }

    public void start() {
        System.out.println(name + " is starting.");
    }

    public void stop() {
        System.out.println(name + " is stopping.");
    }

    public void accelerate() {
        System.out.println(name + " is accelerating.");
    }

    public void brake() {
        System.out.println(name + " is braking.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Wheels: " + wheels);
        System.out.println("Max Speed: " + maxSpeed + " mph");
    }
}

class Car extends Vehicle {
    private String fuelType;

    public Car(String name, int wheels, int maxSpeed, String fuelType) {
        super(name, wheels, maxSpeed);
        this.fuelType = fuelType;
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Bicycle extends Vehicle {
    private int numGears;

    public Bicycle(String name, int wheels, int maxSpeed, int numGears) {
        super(name, wheels, maxSpeed);
        this.numGears = numGears;
    }

    public void ringBell() {
        System.out.println("Ring! Ring!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Gears: " + numGears);
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car("Sedan Car", 4, 120, "Gasoline");
        Bicycle bicycle = new Bicycle("Mountain Bike", 2, 20, 21);

        System.out.println("Car Details:");
        car.displayInfo();
        car.start();
        car.accelerate();
        car.honk();
        car.brake();
        car.stop();

        System.out.println("\nBicycle Details:");
        bicycle.displayInfo();
        bicycle.start();
        bicycle.accelerate();
        bicycle.ringBell();
        bicycle.brake();
        bicycle.stop();
    }
}

