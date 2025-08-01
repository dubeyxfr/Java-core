package Function;
import java.util.Scanner;
public class ISPRIME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the isPrime calculater>>>");
        System.out.print("enter the your number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println(isPrime);


    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;


        }

        return true;
    }

}