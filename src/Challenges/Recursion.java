package Challenges;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Factorial by Recursion\n");
        System.out.print("Please Enter your Number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Your factorial of the " +num + " is " +fact);

    }
    public static long factorial (int num){
        if (num == 1){
            return  1;
        }
        return num * factorial(num - 1);
    }
    public static long factorialInterative(int num){
        int result = 1;
        for (int i = 1;i<=num ; i++){
            result *= i;

        }
        return result;

    }
}
