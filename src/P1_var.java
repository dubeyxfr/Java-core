import java.util.Scanner;

public class P1_var {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Num = ");
        int num = input.nextInt();
        printTable(num);


    }
    public static void printTable(int num) {
        int i = 1;
        while (i < 10) {
            System.out.println("num " + " X " + i + "=" + (num * i));
            i++;
        }
    }
}
