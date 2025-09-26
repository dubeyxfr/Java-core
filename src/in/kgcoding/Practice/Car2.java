package in.kgcoding.Practice;

public class Car2 extends Vehicle_1 {


    public Car2(String services, String carModels, int AmountForServices) {
        super(services, carModels, AmountForServices);
        if (AmountForServices >= 400){
            System.out.println("your Washing is Started");
        }else{
            System.out.println("your Washing not Started washing Price = 400rs ");
        }
    }
}

