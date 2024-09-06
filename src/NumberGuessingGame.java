import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;  // Generate a random number between 1 and 100
        int attempts = 0;  // Counter for the number of attempts
        int guess = 0;  // Variable to store the user's guess
        boolean continueGame = true;  // Flag to control the game loop

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        System.out.println("Press 'x' to quit anytime or 'y' to continue after each guess.");

        // Loop until the user guesses the correct number or decides to quit
        while (continueGame) {
            System.out.print("Enter your guess: ");
            String input = scanner.next();  // Read user input

            // Check if the user wants to quit
            if (input.equalsIgnoreCase("x")) {
                System.out.println("You chose to quit. Goodbye!");
                break;
            }

            // Parse the input to an integer
            try {
                guess = Integer.parseInt(input);  // Convert input to an integer
                attempts++;  // Increment the number of attempts

                // Provide feedback on the guess
                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You've guessed the number.");
                    System.out.println("It took you " + attempts + " attempts.");
                    break;
                }

                // Ask if the user wants to continue
                System.out.print("Press 'y' to continue or 'x' to quit: ");
                char choice = scanner.next().charAt(0);
                if (choice == 'x' || choice == 'X') {
                    System.out.println("You chose to quit. Goodbye!");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to quit.");
            }
        }

        scanner.close();  // Close the scanner
    }
}