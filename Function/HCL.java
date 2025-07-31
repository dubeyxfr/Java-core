package Function;
import java.util.Scanner;
public class HCL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the HCL Calculator");
        System.out.print("Enter the num: ");
        int num1 = input.nextInt();
        System.out.print("Enter the num: ");
        int num2 = input.nextInt();
        System.out.println("your ans are: " +HCL(num1,num2));


    }
    public static int HCL(int num1, int num2){
        int HCL = 1;
        int i = 2;
        int least = least( num1, num2);
        while (i<=least){
            if(num1 % i ==0 && num2 % i == 0){
                HCL = i;
                i++;
            }
            i++;

        }
        return HCL;
    }
    public static int least(int num1,int num2){
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }

    }
}
