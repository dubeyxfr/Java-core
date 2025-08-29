package Control_Statments;

import java.util.Scanner;

    import java.util.Scanner;

    public class Short {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int min = Math.min(a, b);  // Built in method ->    by maths
            System.out.println(min + " is the minimum number");

        }
    }


