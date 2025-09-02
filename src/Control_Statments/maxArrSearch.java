package Control_Statments;

import Challenges.ArrayUtility;

import java.util.Scanner;

public class maxArrSearch {
    public static void main(String[] args) {
        System.out.println("Welcome to the Array Search\n");
        int[] arr = ArrayUtility.intputArray();

        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if (max < num ){
                max= num;

            }
        }
        System.out.println("Maximum num is " +max);
    }
}
