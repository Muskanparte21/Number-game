import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess;
        boolean hasGuessedCorrectly = false;
        int attempts = 0;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
        scanner.close();
    }
}
