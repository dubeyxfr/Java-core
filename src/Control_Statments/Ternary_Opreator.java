package Control_Statments;

import java.util.Scanner;

public class Ternary_Opreator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number checker \n");
        System.out.print("Enter teh First Number = ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number = ");
        int num2 = input.nextInt();
//        if (num1 < num2){
//            System.out.println(num2 + " is the Grater Number");
//
//        } else if (num1 == num2) {
//            System.out.println(num1 +" and " + num2 + " are Equals so please provide Differents numbers");
//
//        } else {
//            System.out.println(num1  + " is the Grater Number");
//        }
        int graternumber = num1 > num2 ? num1 : num2;
        System.out.println(graternumber + " is the Grater number");


    }
}
