import java.util.Scanner;
public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of the triangle...");
        System.out.println(" ");
        System.out.print("Enter the value of the length: ");
        int l = input.nextInt();
        System.out.print("enter the value of the breath: ");
        int b = input.nextInt();
        int area = (int) (0.5*l*b);
        System.out.println("The Area of the triangle are; " + area);




    }

}
