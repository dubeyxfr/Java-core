package Control_Statments;

import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Absolute Ternary\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int result = num>= 0 ? num : -num;
        System.out.println("Absolute Number is " + result);
    }
}
