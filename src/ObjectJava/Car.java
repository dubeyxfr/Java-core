package ObjectJava;

public class Car {
    //Properties of the Car
    int noOfWheels;
    String color;
    float MaxSpeed;

    float CurrentFuleInLitter;

    int noOfSeats;

    //Methods of the car
    public void start (){
        if (CurrentFuleInLitter <= 0){
            System.out.println("Your car is out of fuel, Can not Start");
        } else if (CurrentFuleInLitter < 5) {
            System.out.println("Your car is in the Reserved mode, Please Refuel it ");
        }else {
            System.out.println("Car is Started, bruhhhhhh.....");

        }
    }
    public void Driving(){
        CurrentFuleInLitter--;
        System.out.println("Car is Driving...");
    }
    public void addFuel(float fuel){
        CurrentFuleInLitter += fuel;
    }
    public float GetCurretFuelLevel(){
        return CurrentFuleInLitter;
    }

}

