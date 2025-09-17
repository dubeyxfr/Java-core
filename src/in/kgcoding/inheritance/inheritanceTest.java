package in.kgcoding.inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
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
