package in.kgcoding.Exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Division Calculator\n");
        System.out.print("Enter the first Number: ");
        int first = input.nextInt();

        System.out.print("Enter the Second Number: ");
        int second = input.nextInt();

        try {
            int result = first / second;   // main operation
            System.out.printf("Result is %d\n", result);
        }
        catch (ArithmeticException exc) {
            System.out.printf("%s. Please enter a valid number.\n", exc.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array went out of bounds.");
        }
    }
}
