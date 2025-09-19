package RevisionPortal;

import java.util.Scanner;

public class occ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Revision Session of Occurrence");
        int[] myArr = {2, 3, 4, 5, 6,};
        System.out.print("Enter the value you want to check: ");
        int target = input.nextInt();
        int i;
        int count = 0;
        for (i = 0; i < myArr.length; i++) {
        if (target == myArr[i]) {
            count++;
        }
        }
        System.out.println(count);


    }

}
