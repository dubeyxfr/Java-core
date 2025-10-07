package BasicsCode;

import java.util.Scanner;

public class PrimeOptimization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        prime(num);
    }

    public static void prime(int num) {
        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}
