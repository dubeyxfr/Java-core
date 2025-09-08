package Control_Statments;

public class Car {
    int nofWheels;
    int noOfGates;
    String carName;
    String ModelNumber;
    int MaxSpeed;

    public Car(int nofWheels, int noOfGates, String carName, String modelNumber, int maxSpeed) {
        this.nofWheels = nofWheels;
        this.noOfGates = noOfGates;
        this.carName = carName;
        ModelNumber = modelNumber;
        MaxSpeed = maxSpeed;
    }
    public String toString() {
        return "My name is: " +carName;
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4,"Swift", "SW874",120);
        System.out.println(swift.toString());



    }
}

