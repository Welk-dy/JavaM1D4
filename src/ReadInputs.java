import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();  // List to store the input numbers

        char choice = 'y';  // Initial choice to continue
        while (choice == 'y' || choice == 'Y') {  // Continue while user presses 'y' or 'Y'
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();  // Read the number input
            numbers.add(number);  // Add the number to the list

            System.out.print("Press 'y' to continue or 'n' to stop: ");
            choice = scanner.next().charAt(0);  // Read the user's choice
        }

        // Output: Print all entered numbers
        System.out.println("Entered numbers: " + numbers);
        scanner.close();
    }
}