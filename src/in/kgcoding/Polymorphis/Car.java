package in.kgcoding.Polymorphis;

public class Car extends Vehicle {
    private int noOfDoors = 5;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Car is Starting....");
    }

    @Override
    public void Start() {
        System.out.println("Car is Starting Again");
    }

    public void noOfDoors() {
        noOfDoors = 4;
    }
    Car (int noOfTires){
        super(noOfTires);
    }
}

