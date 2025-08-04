import java.sql.SQLOutput;
import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome the ticket discount Checkek...");
        System.out.println("Please Enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you female? (true/false) ");
        boolean isFemale = input.nextBoolean();

        if(age < 5){
            System.out.print("You got the 75% discount");
        }else if(isFemale) {
            System.out.print("You got the 50% discount");

        } else if (age > 60 && !isFemale) {
            System.out.println("You got the 50% discount");

        }


    }
}
