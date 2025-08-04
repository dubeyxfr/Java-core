package Function;
import java.util.Scanner;
public class Sumofdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the sum of digits calculator ");
        System.out.print("Enter the value of the NUM; ");
        int num = scanner.nextInt();
        int sum = Sumofdigit(num);
        System.out.println("Sum  of the Digit of " +num + " is = " +sum);


    }
    public static int Sumofdigit(int num){
        int sum = 0;
        while (num >0){
            sum += num %10; // calculation
            num/=10; //engrement
        }
        return sum;
    }



}
