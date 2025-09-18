package in.kgcoding.Abstration;

public class Abstrationtest {
    public static void main(String[] args) {
         Car car = new Car(4);
        car.setNoOfTires(9);
        System.out.println(car);
        car.commute();
    }
}
