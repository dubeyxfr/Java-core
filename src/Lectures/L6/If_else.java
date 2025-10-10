package Lectures.L6;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        System.out.println("Salary Bounce calculator...");
        Scanner input = new Scanner(System.in);
        System.out.print("Input Employed Salary: ");
        int salary = input.nextInt();
        if (salary >= 10000){
            System.out.println("Your salary with Bounce = " +(salary+2000));
        }else{
            System.out.println( "Your salary with Bounce = " +(salary+1000));
        }

    }
}
