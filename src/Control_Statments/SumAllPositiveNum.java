package Control_Statments;

import Challenges.ArrayUtility;

import java.util.Scanner;

public class SumAllPositiveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the All add positive num\n");
        int[] numArr = ArrayUtility.intputArray();
        int sum = 0;
        for (int num : numArr){
            if (num < 0){
                continue; //
            }
            sum += num; //



        }
        System.out.println("Your Number sum is " +sum);
    }
}
