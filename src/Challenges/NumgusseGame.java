package Challenges;

import java.util.Scanner;

public class NumgusseGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5 , gusse;
        System.out.println("Welcome to Number Guessing game");
        do {
            System.out.print("please enter the guess between 1 to 10 : ");
            gusse = input.nextInt();
        }
        while(gusse != num);
            System.out.println("Your guess is correct");

    }
}
