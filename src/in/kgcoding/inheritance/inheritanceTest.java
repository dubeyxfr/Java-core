package in.kgcoding.inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        TwoWheelers two = new TwoWheelers();
        two.commute();
        two.balance();

        MotorCycle motor = new MotorCycle();
        motor.noOfTires++;
        motor.noOfTires++;
        motor.start();
        motor.commute();
        motor.balance();

    }
}
