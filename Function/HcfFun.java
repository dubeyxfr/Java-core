package Function;

import java.util.Scanner;

public class HcfFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int result = Hcf(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + result);
    }

    public static int Hcf(int a, int b) {
        int hcf = 1;
        int min = Math.min(a, b); // HCF can't be more than the smaller number

        int i = 1;
        while (i <= min) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
            i++;
        }

        return hcf;
    }
}
