package Function;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int num1 = readNumber();
        int num2 = readNumber();
        int sum = num1 / num2;
        System.out.println("the ans is " + sum);


    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number num: ");
        int num = input.nextInt();
        return num;
    }
}
