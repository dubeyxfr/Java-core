package in.kgcoding.Exception;

import java.util.Scanner;

public class Challenge87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First value: ");
        int first = input.nextInt();
        System.out.println("Enter the Second Value: ");
        int second = input.nextInt();
        try {
            int division = first/second;
            System.out.printf("Division is %d" ,division);
        }catch (ArithmeticException exception){
            System.out.printf("%s,Enter the Valid Value"
            ,exception.getMessage());
        }
    }
}
