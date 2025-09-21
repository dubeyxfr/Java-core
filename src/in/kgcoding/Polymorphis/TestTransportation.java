package in.kgcoding.Polymorphis;

public class TestTransportation {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle v = new Vehicle();

        Vehicle Vcar = new Car(); // here dont need the type casting

        Car vCar = (Car) new Vehicle();
        // here we need ot type casting for the error
        Object ob = new Car(); //we can do this with the default object.
    }
}
