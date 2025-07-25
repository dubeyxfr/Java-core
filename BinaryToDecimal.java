
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking binary input from user
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        // Converting binary to decimal
        int decimal = Integer.parseInt(binary, 2);

        // Printing the result
        System.out.println("Decimal number is: " + decimal);
    }
}
