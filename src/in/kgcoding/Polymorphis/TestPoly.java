package in.kgcoding.Polymorphis;

import in.kgcoding.Abstration.Vehicle;

public class TestPoly {
    public static void main(String[] args) {
        vechile car = new Car();
        Car Car = new Car();
        Testpoly(car);

    }
    public static void Testpoly(vechile veh){
        veh.start();
    }
}