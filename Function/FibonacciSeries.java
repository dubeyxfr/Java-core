package Function;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the isPrime Fibonacci series>>>");
        System.out.print("enter the your number: ");
        int num = input.nextInt();
        System.out.println("Your fibonacci series ");
        Fibonacci(num);

    }
    public static void Fibonacci(int num){
        if (num<0)return;;
        System.out.print("0 ");
        if(num==0)return;
        System.out.print("1 ");
        int first = 0,second =1;
        while(first+second<=num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
