package in.kgcoding;

public class Car {
    public String color;
    public String model;
    double FuelLevel;
    long CostOfPurchase;


    public Car() {
    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        FuelLevel = fuelLevel;
        CostOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car -> " +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", FuelLevel=" + FuelLevel +
                ", CostOfPurchase=" + CostOfPurchase +
                '.';
    }
}
