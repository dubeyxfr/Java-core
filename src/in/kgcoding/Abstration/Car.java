package in.kgcoding.Abstration;

public class Car extends Vehicle {


    @Override
    public void makeStartSound() {
        System.out.println("vroom....");
    }
    @Override
    public void getSetGo() {
        System.out.println("Going to Place....");
    }

    public Car(int noOfTires) {
        super(4);
    }
}
