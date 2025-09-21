package BasicsCode;

import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        if(num > 0){
            System.out.println("This num is positive");
        } else if (num ==0) {
            System.out.println("This num is Zero");

        }else{
            System.out.println("num is Negative");
        }




    }
}
