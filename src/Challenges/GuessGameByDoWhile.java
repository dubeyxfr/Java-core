package Challenges;

import java.util.Scanner;

public class GuessGameByDoWhile {
    int random;

    // Constructor
    GuessGameByDoWhile() {
        // Random number between 1 to 100
        random = (int) Math.ceil(Math.random() * 100);
    }

    // Method to compare guess
    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessGameByDoWhile game = new GuessGameByDoWhile(); // Game object

        System.out.println("🎮 Welcome to the Guess Game (1 to 100)\n");

        int guess;
        int result;

        // Loop until guess is correct
        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            result = game.guess(guess);

            if (result == 0) {
                System.out.println("✅ Congrats! Your guess is correct.");
            } else if (result < 0) {
                System.out.println("⬆️ Please guess a higher number.");
            } else {
                System.out.println("⬇️ Please guess a lower number.");
            }

        } while (result != 0);
    }
}

