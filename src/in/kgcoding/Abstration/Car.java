package in.kgcoding.Abstration;

public class Car extends Vehicle {


    @Override
    public void makeStartSound() {
        System.out.println("vroom....");
    }

    public Car(int noOfTires) {
        super(4);
    }
}
