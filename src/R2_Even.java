import java.util.Scanner;

public class R2_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the num which you want to check = ");
        int num = input.nextInt();
        evenNum(num);


    }
    public static void evenNum(int num){
            if (num % 2 ==0){
                System.out.println("your num is even!!");
            } else {
                System.out.println("your num is odd");
            }


    }
}
