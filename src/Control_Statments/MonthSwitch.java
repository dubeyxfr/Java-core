package Control_Statments;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the months mapping");
        System.out.print("enter the Month number ");
        int monthNum = input.nextInt();
        String monthsName = getMonths(monthNum);
        System.out.println("Your current Month name is " +monthsName);

    }
    public static String getMonths(int monthNum){
        String monthName = switch (monthNum) {
            case 1 -> "January";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "may";
            case 6 -> "June";
            case 7 -> "july";
            case 8 -> "aug";
            case 9 -> "sep";
            case 10 -> "obc";
            case 11 -> "Nov";
            case 12 -> "Dec";

            default -> "Invaliad Months";

        };



    return monthName ;
    }
}
