
import java.util.Scanner;

    public class PalindromeCheck {

        // Function to check if number is palindrome
        public static void checkPalindrome(int num) {
            int original = num;
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if (original == reverse) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is NOT a Palindrome.");
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number to check Palindrome: ");
            int number = input.nextInt();

            checkPalindrome(number);
        }
    }
