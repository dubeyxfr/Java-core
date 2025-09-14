package ObjectJava;

public class getterSetter {

        private String color;
        private String model;
        double FuelLevel;
        long CostOfPurchase;
        public String getColor(){
            return color;
        }
        public String getModel(){ //
            return model;
        }
         public void Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        FuelLevel = fuelLevel;
        CostOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "ObjectJava.getterSetter{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", FuelLevel=" + FuelLevel +
                ", CostOfPurchase=" + CostOfPurchase +
                '}';
    }
}
