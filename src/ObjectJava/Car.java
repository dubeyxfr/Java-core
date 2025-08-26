package ObjectJava;

public class Car {
    static int noOfCarSold;
    static {
        noOfCarSold = 0;
        System.out.println("I am in Static code");
    }
    {
        noOfCarSold++;
        System.out.println("i am in initlization code ");
    }
    // Properties
    int noOfWheels; //instance variable
    String color;   //instance variable
    int maxSpeed;//instance variable
    float currentFuelInLiters; //instance variable
    int noOfSeats;  //instance variable
  

    // Constructor with perameterized
    Car(String color) {
        noOfSeats = 5;
        noOfWheels = 4;
        maxSpeed = 150;
        this.color = color;
        currentFuelInLiters = 2; // Initially empty
    }
    //constructor with default providing in the main constructor
    Car() {
     this ("Black");
    }


    // Methods
    public void start() {  //local variable
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



