package BasicsCode;

import java.util.Scanner;

public class function_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++){
            int table = num * i;
            System.out.printf("%d X %d = %d\n",num,i,table);
        }
    }


}
