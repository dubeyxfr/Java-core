package Challenges;

import java.util.Scanner;

public class GuessingGame {

    // Method to generate a random number between 1 and 100
    int generateRandomNumber() {
        // Math.random() * 10 gives a double between 0.0 and 9.99...
        // (int) casts it to an integer, truncating the decimal (0 to 9)
        // + 1 shifts the range to 1 to 10
        return (int) (Math.random() * 10) + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing game!");
        System.out.println("The rule is: The number is between 1 to 100.\n");

        GuessingGame game = new GuessingGame(); // Create an instance of the game
        int secretNumber = game.generateRandomNumber(); // Get the secret number

        System.out.print("Enter your Lucky Number: ");
        int userGuess = input.nextInt();

        if (userGuess == secretNumber) {
            System.out.println("Congratulations! You Win!");
        } else {
            System.out.println("Sorry, you lose. The secret number was: " + secretNumber);
        }

        input.close(); // Close the scanner
    }
}
