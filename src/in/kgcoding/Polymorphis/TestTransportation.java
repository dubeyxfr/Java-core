package in.kgcoding.Polymorphis;

public class TestTransportation {
    public static void main(String[] args) {
        Car car = new Car(4);

        Vehicle v = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Plane is going to taking  Off ");
            }

            @Override
            public void Start() {
                System.out.println("never");
            }
        };

        Vehicle Vcar = new Car(4); // ✅ polymorphism: Vehicle reference, Car object

        Plane p = new Plane();

        Object ob = new Car(4); // ✅ sab kuch Object ka child hai

        StartCast(car); // ✅ Car object pass hua
        StartCast(p);   // ❌ Yaha problem hogi
    }

    public static void StartCast(Vehicle veh) {
        Car cVehicle = (Car) veh;  // ❌ Dangerous casting
        cVehicle.noOfDoors();
        veh.Start();
    }
}
