package in.kgcoding.Exception;

import java.util.Scanner;

public class ThrowAndThrows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age<18){
            throw new ArithmeticException("not Eligible for vote.");
        }
        System.out.println("You can Vote Now");
    }
    //Throw is use to single exception which can create by the users.
    //throws is the Keyword is Multiple exception types declare karta hai.
}
