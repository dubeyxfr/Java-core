package Control_Statments;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your age ");
//        int age = input.nextInt();
//        while (age < 0 || age > 100){
//            System.out.println("your Age is " +age);
//        }
//        System.out.println("Enter the Age again, Age limit = 1 to 100\n");
//        System.out.print("Enter your age ");
//        age = input.nextInt();
        int age;
        do {
            System.out.print("Enter the Age: ");
            age = input.nextInt();
            if (age < 1 || age >= 100 ) {
                System.out.println("Invalid Age Enter (age limit - 1 to 100) ");

            }

            } while (age >0 || age < 100);
            System.out.println("Your Age is " +age);

    }
}
