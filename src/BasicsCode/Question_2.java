package BasicsCode;

import java.util.Scanner;


public class Question_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;



        }
        System.out.println("the sum the num " +n+ " multiple is = "+sum);



    }
}
