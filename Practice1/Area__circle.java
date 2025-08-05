import java.util.Scanner;
public class Area__circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program of the ARea of the Circle...");
        System.out.println(" ");
        System.out.print("Enter the Value of the Radius: ");
        double r = input.nextDouble();
        double area = Math.PI *r*r;
        System.out.println("Area of the circle are: " + area);


    }
}

