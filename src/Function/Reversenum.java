package Function;
import java.util.Scanner;
public class Reversenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the sum of digits calculator ");
        System.out.print("Enter the value of the NUM; ");
        int num = scanner.nextInt();
        int sum = ReverseNUM(num);
        System.out.println("Reverse  of the Digit of " +num + " is = " +sum);

    }
    public static int ReverseNUM(int num){
        int rev = 0;
        while (num>0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /=10;


        }
        return rev;
    }

}
