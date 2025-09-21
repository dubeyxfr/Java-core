package in.kgcoding.Polymorphis;

public class Car implements Vehicle{
    public int noOfDoors(){
        return 5;
    }

    @Override
    public void Start() {
        System.out.println("car is Starting...");
    }
}
