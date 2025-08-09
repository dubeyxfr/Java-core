package Challenges;

import java.util.Scanner;

import static Challenges.ch2_occurrencesArray.noOfOccurrences;

public class DeleteFromArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] originalArr = ArrayUtility.intputArray();

        System.out.print("Enter the value you want to delete: ");
        int deleteNum = input.nextInt();

        int[] resultArr = deleteArr(originalArr, deleteNum);

        System.out.println("Here is your new array:");
        ArrayUtility.displayarr(resultArr);
    }

    public static int[] deleteArr(int[] arr, int deleteNum) {
        // Count occurrences of the number to be deleted
        int occ = noOfOccurrences(arr, deleteNum);
        if (occ == 0) {
            return arr; // no change
        }

        // Create new array with reduced size
        int newSize = arr.length - occ;
        int[] resultArr = new int[newSize];

        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != deleteNum) {
                resultArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return resultArr;
    }
}
