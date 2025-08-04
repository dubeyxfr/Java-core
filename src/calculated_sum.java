
import java.util.Scanner;

public class calculated_sum {
    public static int calculated_sum(int a, int b){//this is the parameters /formal para meters

        int sum = a+b;
        System.out.println("sum of the a and b: " +sum);
        return sum;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the a: ");
        int a = sc.nextInt();
        System.out.print("enter the b ");
        int b = sc.nextInt();
        int sum = calculated_sum(a,b);//achtual parameters or arguments

    }


}
