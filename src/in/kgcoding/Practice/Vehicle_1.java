package in.kgcoding.Practice;

public class Vehicle_1 {
   String services;
   String CarModels;
   int AmountForServices;

    public Vehicle_1(String services, String carModels,int AmountForServices) {
        this.services = services;
        CarModels = carModels;
        this.AmountForServices = AmountForServices;
    }

    @Override
    public String toString() {
        return "Vehicle_1{" +
                "services='" + services + '\'' +
                ", CarModels='" + CarModels + '\'' +
                ", AmountForServices=" + AmountForServices +
                '}';
    }

    public int getAmountForServices() {
        return AmountForServices;
    }

    public void setAmountForServices(int amountForServices) {
        AmountForServices = amountForServices;
    }
}
