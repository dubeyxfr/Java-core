package RevisionPortal;

import java.util.Scanner;

public class revisionOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] myArr = {2,3,4,5,6,2,8};
        System.out.print("Enter the Number to check: ");

        int target = input.nextInt();
        int count = 0;
        for (int i = 0; i < myArr.length; i++){
            if (target == myArr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
