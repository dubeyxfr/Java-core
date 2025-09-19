package RevisionPortal;

import Challenges.ArrayUtility;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sorting Array");
        int [] myArr = ArrayUtility.intputArray();
        boolean inc = increase(myArr);
        boolean dec = decrease(myArr);
        if (inc || dec) {
            System.out.println("Your Array is Sorted");
        }
        else {
            System.out.println("Not Sorted Array");
        }




    }
    public static boolean increase (int[] myArr){
        for (int i = 0; i < myArr.length;i++){
            if (myArr[i] < myArr[i - 1]){
                return false;
            }
        }
        return true;
    }
    public static boolean decrease(int[] myArr) {
        for (int i = 0 ;i < myArr.length;i++){
            if (myArr[i] > myArr[i - 1]) {
                return false;
            }

        }
        return true;
    }
}
