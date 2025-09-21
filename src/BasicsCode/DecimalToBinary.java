package BasicsCode;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get decimal number from user
        System.out.print("Enter a decimal number (e.g., 10.625): ");
        double num = input.nextDouble();

        // Separate integer and fractional part
        int intPart = (int) num;
        double fracPart = num - intPart;

        // Convert integer part to binary
        String intBinary = Integer.toBinaryString(intPart);

        // Convert fractional part to binary
        StringBuilder fracBinary = new StringBuilder();
        while (fracPart > 0 && fracBinary.length() < 10) { // limit to 10 digits
            fracPart *= 2;
            if (fracPart >= 1) {
                fracBinary.append("1");
                fracPart -= 1;
            } else {
                fracBinary.append("0");
            }
        }

        // Print the result
        System.out.println("Binary number is: " + intBinary + "." + fracBinary);
    }
}
