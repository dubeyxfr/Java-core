package Challenges;

import java.util.Scanner;

public class MaxMinArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the MaxMinArr..\n");
        int[] myArr = ArrayUtility.intputArray();
        int Max = max(myArr);
        int min = Min(myArr);
        System.out.println("min of the Array is " + min);
        System.out.println("Max of the Array is " + Max);


    }
    public static int Min(int[] myArr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i< myArr.length){
            if (min> myArr[i]){
                min = myArr[i];

            }
            i++;
        }
        return min;

    }
    public static int max(int[] myArr){
        if(myArr.length == 0){
            return Integer.MAX_VALUE;
        }
        int max = myArr[0];
        int i = 1;
        while (i< myArr.length){
            if (max < myArr.length){
                max = myArr[i];
                i++;
            }
        }


        return max;
    }
}
