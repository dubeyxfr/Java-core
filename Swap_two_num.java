
import java.util.Scanner;

public class Swap_two_num {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the Swaping values");
        System.out.print("Enter the First value: ");
        int a = input.nextInt();
        System.out.print("Enter the Second values: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of A is: " + a);
        System.out.println("value of the B is: " + b);
    }
}
