package in.kgcoding.inheritance;

public class TwoWheelers extends Vehicle {
    TwoWheelers (){
        noOfTires = 2;
    }
    public void balance (){
        System.out.printf("I am Balancing on %d tires...",noOfTires);
    }

}
