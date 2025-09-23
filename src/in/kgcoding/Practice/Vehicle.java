package in.kgcoding.Practice;

public class Vehicle {
    int speed;
    String colour;

    public Vehicle(int speed, String colour) {
        this.speed = speed;
        this.colour = colour;
    }
    public void displayInfo() {
        System.out.println("Speed" + speed + "km/h");
        System.out.println("Colour" + colour);
    }
}
