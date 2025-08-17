package ObjectJava;

public class Car {
    //Properties of the Car
    int noOfWheels;
    String color;
    float MaxSpeed;

    float CurrentFuleInLitter;

    int noOfSeats;

    //Methods of the car
    public void Driving(){
        System.out.println("Car is Driving");
        CurrentFuleInLitter--;
    }
    public void Fuel(float fuel){
        CurrentFuleInLitter += fuel;

    }
    public float GetCurretFuelLevel(){
        return CurrentFuleInLitter;
    }

}

