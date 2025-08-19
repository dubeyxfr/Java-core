package ObjectJava;

public class Drive {
    public static void main(String[] args) {
        //
        Car myCar = new Car();

        myCar.addFuel(6);

        myCar.Driving();
        myCar.Driving();
        myCar.Driving();
        myCar.addFuel(5);
        System.out.println(myCar.GetCurretFuelLevel());

    }
}
