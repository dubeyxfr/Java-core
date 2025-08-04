package Function;
import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome the Multipication table world\n");
        System.out.print("Enter the num: ");
        int num = scanner.nextInt();
        printmultiplicationtable(num);

    }
    public static void printmultiplicationtable(int num){
        int i = 1;
        while (i<=10){
            System.out.println(num + " X " + i + "=" + (num*i));
            i++;
        }

    }

    public static class LCMFUNCTION {
        public static void main(String[] args) {

        }
    }
}

