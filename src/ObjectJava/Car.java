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
        if (CurrentFuleInLitter <= 0){
            System.out.println("Your car is out of fuel");
        } else if (CurrentFuleInLitter < 5) {
            System.out.println("Your car is in the Reserved mode, Please Refuel it ");
            
        }else {
            System.out.println("Car is Driving");
            CurrentFuleInLitter--;
        }
    }
    public void addFuel(float fuel){
        CurrentFuleInLitter += fuel;

    }
    public float GetCurretFuelLevel(){
        return CurrentFuleInLitter;
    }

}

