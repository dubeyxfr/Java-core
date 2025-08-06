package Function;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {2,3,4,6,7,12,33,42,56,};
        System.out.println("Welcome to Array Searching\n");
        System.out.print("Enter the num Which you want to find: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound){
            System.out.println("👍congratulation Your num is found in arr list");
        }else {
            System.out.println("Sorry 😒😒your num is not found in arr list");
        }


    }
    public static boolean isFound(int [] arr, int num){
        int index = 0;
        while (index < arr.length){
            if (arr[index] == num);
            return true;

        }

        return false;
    }
}
