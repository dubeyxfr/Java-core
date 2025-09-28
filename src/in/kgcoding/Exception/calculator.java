package in.kgcoding.Exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Division Calculator/n");
        System.out.print("Enter the first Number: ");
        int First = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int Second = input.nextInt();
        try {
            int result = First / Second;
            System.out.printf("Result is %d", result);//result
        } catch (ArithmeticException exception){
            System.out.printf(" %s,lease Enter Valid Number.",exception.getMessage());
        }
    }

}
