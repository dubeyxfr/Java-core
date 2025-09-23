package in.kgcoding.Practice;

public class car {
    public String brand;
    public int Price;

    public car(String brand, int Price) {
        this.brand = brand;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", Price=" + Price +
                '}';
    }

    public static void main(String[] args) {
        car Bmw = new car("Bmw M3",100000);
        System.out.println(Bmw);
    }

}
