package Challenges;

public class CarFinal {
    final int noOfWheels;
    final String model;
    final int engineInLiter;

    public CarFinal(int noOfWheels, String model, int engineInLiter) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiter = engineInLiter;

    }

    @Override
    public String toString() {
        return "CarFinal{" +
                "noOfWheels=" + noOfWheels +
                ", model='" + model + '\'' +
                ", engineInLiter=" + engineInLiter +
                '}';
    }

    public static void main(String[] args) {
        CarFinal car = new CarFinal(4,"BMW",9);
        System.out.println(car);

    }
}
