package Challenges;

import java.util.Scanner;

public class PassWordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome ot Password Checker\n");
        String password;
        do {
            System.out.print("Enter your Password: ");
            password = input.next();
        }while(!isVaildPassword(password));
        System.out.println("Thanks for enter correct Password");

    }
    public static boolean isVaildPassword(String password){
        return password.length() > 6;

    }
}
