package Control_Statments;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci Series By recursion\n");
        System.out.print("Enter the Element which you want to check: ");
        int count = input.nextInt();
        for (int i = 1; i <= count ; i++) {
            System.out.println("Your fibonacci Series is " + count + " is " + fibonacci(count));
        }



    }
    public static int fibonacci(int position){
        if (position == 1){
            return 0;

        }
        if (position == 2){
            return 2;
        }
        return fibonacci(position - 1) + fibonacci(position-2);
    }
}
