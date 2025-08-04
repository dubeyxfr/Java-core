
import java.util.Scanner;
public class Area_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of the rectangle...");
        System.out.println(" ");
        System.out.print("Enter the value of the length: ");
        double l = input.nextDouble();
        System.out.print("Enter the value of the Breath");
        double b = input.nextDouble();
        double area = l*b;
        System.out.println("Area of the rectangle: " + area);



    }
}
