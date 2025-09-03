package Challenges;

import java.util.Scanner;

public class OccursesByFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrences");
        int[] nums = ArrayUtility.intputArray();
        System.out.print("Now Enter the Number to Search : ");
        int element = input.nextInt();
        int occ = countOccurrenses(nums,element);

    }
    public static int countOccurrenses(int nums, int element){
        int occ = 0;
        for (int num : nums )
            if (nums == element){
                occ++;
            }
        return occ;
    }
}
