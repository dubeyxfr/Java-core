package Control_Statments;

import java.util.Scanner;

public class ch53_minimumOftwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the minimum of two Num\n");
        System.out.print("Enter the First Num: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Num: ");
        int num2 = input.nextInt();

        minimumOfnums(num1, num2);  // ✅ Call method
    }

    public static void minimumOfnums(int num1, int num2) {
        int minimumOfnum = (num1 < num2) ? num1 : num2; // Ternary Operator
        System.out.println(minimumOfnum + " is the minimum number");
    }
}

