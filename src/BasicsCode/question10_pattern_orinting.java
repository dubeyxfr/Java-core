package BasicsCode;

import java.util.Scanner;

public class question10_pattern_orinting {
    public static void question10_pattern_orinting(int n) {

        //outer
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        question10_pattern_orinting(4);
    }


    public static class ArraySum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            System.out.println("Sum of all elements: " + sum);
        }
    }
}







