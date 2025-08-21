package ObjectJava;

public class Car {
    // Properties
    int noOfWheels;
    String color;
    int maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
  

    // Constructor with perameterized
    Car(String color) {
        noOfSeats = 5;
        noOfWheels = 4;
        maxSpeed = 150;
        this.color = color;
        currentFuelInLiters = 2; // Initially empty
    }
    //constructor with default
    Car() {
        noOfSeats = 5;
        noOfWheels = 4;
        maxSpeed = 150;
        color = "Black";
        currentFuelInLiters = 2; // Initially empty
    }


    // Methods
    public void start() {
        if (currentFuelInLiters <= 0) {
            System.out.println("Your car is out of fuel, cannot start.");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Your car is in reserved mode, please refuel.");
        } else {
            System.out.println("Car is started, bruhhhhhh.....");
        }
    }

    public void driving() {
        if (currentFuelInLiters > 0) {
            currentFuelInLiters--;
            System.out.println("Car is driving...");
        } else {
            System.out.println("Cannot drive, no fuel left!");
        }
    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    public void getCarInfo() {
        System.out.println("Car Information:");
        System.out.println("Color: " + color);
        System.out.println("Number of Wheels: " + noOfWheels);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
        System.out.println("Number of Seats: " + noOfSeats);
        System.out.println("Current Fuel Level: " + currentFuelInLiters + " liters");
    }
}



