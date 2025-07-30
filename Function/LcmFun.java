package Function;

import java.util.Scanner;

public class LcmFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int result = Lcm(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
    }

    public static int Lcm(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }
}

