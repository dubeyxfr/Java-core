package BasicsCode;

import java.util.Scanner;

public class BitwiseCompliment {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the num: ");
            int first = input.nextInt();
            int result = ~first;
            System.out.println("the result is: " + result);
        }
    }

