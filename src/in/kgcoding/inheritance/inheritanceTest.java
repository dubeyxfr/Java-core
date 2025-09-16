package in.kgcoding.inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        TwoWheelers two = new TwoWheelers();
        vehicle.commute();
        two.commute();
    }
}
