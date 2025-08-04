import java.util.Scanner;

public class bitwiseEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First num: ");
        int first = input.nextInt();
        System.out.print("enter the Second num: ");
        int second = input.nextInt();
        int result = first | second;
        System.out.println("the result is: " + result);
    }
}
