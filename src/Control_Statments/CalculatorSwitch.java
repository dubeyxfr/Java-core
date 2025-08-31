package Control_Statments;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Standard Calculator\n");
        System.out.print("Enter the First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the Operator to Perform: ");
        String operator = input.next();
        int result = switch (operator)  //calculator by Using the Ternary Operators
        {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;

        };
        System.out.println("Your Answer is the "+result);

    }

}
