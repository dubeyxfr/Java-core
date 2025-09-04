package Control_Statments;

import java.util.Scanner;

public class ExitonExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter your Command: ");
            String command = input.next();
            if (command.equals("exit")){
                break;//break

            }

        }
        System.out.println("You Successfully exit");
    }
}
