package Function;

 import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        System.out.println("Welcome to OddNUm");
        System.out.print("Enter the num: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = ODDNUM(num);
        System.out.println("Oddnum Adition are of  " + num + " is " + sum);


    }
    public static int ODDNUM(int num){
        int i = 0;
        int sum = 0;
        while (i<=num) {
            sum += i;
            i += 2;
        }


        return sum;
    }
}
