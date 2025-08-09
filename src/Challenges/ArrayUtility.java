package Challenges;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] intputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number of Elements: ");
        int size = input.nextInt();
        int[] nums = new int [size];
        int i = 0;
        while (i < size){
            System.out.print("Please Enter Element no " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static void displayarr(int[] nums){
        int i = 0;
        while (i< nums.length){
            System.out.println(nums[i] + " ");
            i++;
        }
    }
}
