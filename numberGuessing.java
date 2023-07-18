import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int secretNumber = generateRandomNumber();
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");

        while (!hasWon) {
            int guessedNumber = getGuessedNumberFromUser();
            attempts++;

            if (guessedNumber == secretNumber) {
                hasWon = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (guessedNumber < secretNumber) {
                System.out.println("Too low! Try guessing a higher number.");
            } else {
                System.out.println("Too high! Try guessing a lower number.");
            }
        }
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Generates a random number between 1 and 100
    }

    private static int getGuessedNumberFromUser() {
        System.out.print("Enter your guess (between 1 and 100): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
