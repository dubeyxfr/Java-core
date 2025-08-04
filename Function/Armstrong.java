package Function;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Armstrong Number Checker");
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Your number is an Armstrong number.");
        } else {
            System.out.println("Your number is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += power(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
