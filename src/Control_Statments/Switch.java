package Control_Statments;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Day of the Week Detector\n");
        System.out.print("Enter your day in num ");
        int day = input.nextInt();
        newSwitch(day);
        oldStr(day);


        }
        public static void newSwitch(int day){
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Holiday";
            default -> "invalid";


        };
            System.out.println(dayStr);



        }
        public static void oldStr(int day){
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Day");
                    break;

        }
    }
}
