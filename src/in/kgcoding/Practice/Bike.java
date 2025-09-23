package in.kgcoding.Practice;

public class Bike extends Vehicle{
    int noOfTires;

    public Bike(int speed, String colour, int noOfTires) {
        super(speed, colour);
        this.noOfTires = noOfTires;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("noOfTires " +noOfTires);
    }
}
