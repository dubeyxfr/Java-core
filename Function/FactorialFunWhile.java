package Function;
import java.util.Scanner;

public class FactorialFunWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Factorial is: " + factorialFun(num));
    }

    public static long factorialFun(int num) {
        long result = 1;
        int i = 1;
        while (i <= num) {
            result *= i;
            i++;
        }
        return result;
    }
}
