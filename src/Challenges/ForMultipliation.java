package Challenges;

import java.util.Scanner;

public class ForMultipliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication");
        System.out.print("Enter your Number to display Multiplication = ");
        int num = input.nextInt();
        for (int i = 0;i<=10; i++){
            System.out.println(+num + " X "+ i + " = " + (num*i));
        }
    }
}
