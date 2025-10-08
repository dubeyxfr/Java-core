package BasicsCode;

public class Car1 {
    private int noOfDoors;

    // repair method uses Tire class
    public void repair () {
        Tire t = new Tire();

    }

    // Inner class Tire
    protected  class Tire {
        private double width;
        private double pressure;
        private String material;
    }
    public void inflate() {
        noOfDoors = 4;

    }
}
