package BasicsCode;

import java.util.Scanner;
public class LeapYearCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the leap year calculater...");
        System.out.println(" ");
        System.out.print("Enter the year for checking thr leap year: ");
        int year = input.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year != 100){
            System.out.println("This is leap year: " + year);
        }else {
            System.out.println("This is not the leap year: " + year);
        }

    }
}
