package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car("Black","BMW",20,12000);
        //car.FuelLevel//not Allow to Access bcs in obj we defined as a private.

        Car newCar = new Car("blue","lambo",20,1200000);
        System.out.println(newCar);







    }
}
