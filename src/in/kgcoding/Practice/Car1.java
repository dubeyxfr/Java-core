package in.kgcoding.Practice;

public class Car1 extends Vehicle{
    int doors;
    public Car1(int speed, String colour, int doors) {
        super(speed, colour);
        this.doors = doors;
    }
    @Override
    public void displayInfo () {
        super.displayInfo();
        System.out.println("Doors" +doors);
    }

}
