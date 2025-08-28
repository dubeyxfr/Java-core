package Control_Statments;

import java.util.Scanner;

class ternaryOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the odd even FInder\n");
        System.out.print("Enter the Number you Want to Find: ");
        int num = input.nextInt();
        ternaryOddEven(num);

    }
    public static void ternaryOddEven(int num){
        String numEvenOdd = num  % 2 == 0 ? "even" : "Odd";
        System.out.println("Your Number is " + numEvenOdd);
    }
}
