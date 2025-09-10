package in.kgcoding;

public class Car {
    public String color;
    public String model;
    private double FuelLevel;
    private long CostOfPurchase;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", FuelLevel=" + FuelLevel +
                ", CostOfPurchase=" + CostOfPurchase +
                '}';
    }
}
