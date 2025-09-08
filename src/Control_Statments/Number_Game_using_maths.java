package Control_Statments;

import java.util.Scanner;

public class Number_Game_using_maths {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-99));
//        System.out.println(Math.ceil(12.09));
//        System.out.println(Math.floor(12.07));
//        System.out.println(Math.round(12.04));
//        System.out.println(Math.random());
//        for (int i = 1 ; i < 10; i++ )
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you num between 0 to 100: ");
        int num = input.nextInt();
            long random = Math.round(Math.random() * 100);
            System.out.println("Genrated Num is  " + random);
            if (num == random){
                System.out.println("you win ");
            }else{
                System.out.println("you lose");
            }


    }
}
