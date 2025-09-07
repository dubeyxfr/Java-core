package Control_Statments;

import java.util.Scanner;

public class RecursionPalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to the PALIBDROME check by Recursion\n");
        System.out.print("Enter your Value to Check: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println("Your String is " +
                (isPalindrome(str) ? "Palindrome " : "Is Not Palindrome"));


    }
    public static boolean isPalindrome(String str){
        if (str.length() == 1){
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);

    }
}
