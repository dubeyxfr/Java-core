package in.kgcoding.inheritance;

public class Vehicle {
   protected int noOfTires;
   public void setNoOfTires(int noOfTires){
       this.noOfTires = noOfTires;
   }
    public void commute () {
        System.out.printf("The Vehicle is travle from A to B by using %d in the vehicle.\n", noOfTires);
    }
}
