package BasicsCode;

import java.util.Scanner;
public class greater_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first digits ");
        int n1 = input.nextInt();
        System.out.print("enter the second digits ");
        int n2 = input.nextInt();
        System.out.print("enter the third digits ");
        int n3 = input.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("n1 is grater num");
        } else if (n2>n1 && n2>n3) {
            System.out.println("n2 is greater num ");

        }else{
            System.out.println("n3 is greater num");
        }
    }
}
