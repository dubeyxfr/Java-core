package in.kgcoding.Polymorphis;

public class TestTransportation {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle v = new Vehicle() {
            @Override
            public void Start() {
                System.out.println("never");
            }
        };

        Vehicle Vcar = new Car(); // here dont need the type casting

        Plane p = new Plane();
        // here we need ot type casting for the error
        Object ob = new Car();//we can do this with the default object
        StartCast(car);
        StartCast(p);

    }
    public static void StartCast(Vehicle veh){
        Car cVehicle = (Car) veh;
        cVehicle.noOfDoors();
        veh.Start();

    }
}
