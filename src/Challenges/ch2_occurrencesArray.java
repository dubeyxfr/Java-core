package Challenges;

import java.util.Scanner;

public class ch2_occurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the occurrences\n");
        int[] myArray = ArrayUtility.intputArray();
        System.out.print("Now enter the which Num you want to check: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(myArray,num);
        System.out.println("your elements was found " + occurrences + " in the table");






    }
    public static int noOfOccurrences(int[] myArray, int num){
        int occ = 0;
        int i = 0;
        while (i < myArray.length) {
            if (myArray[i] == num) {
                occ++;
            }
            i++;

        }
    return occ;
    }

}
