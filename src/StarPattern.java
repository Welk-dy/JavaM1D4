import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the value of n from the user
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        // Output: Print the pattern
        printStarPattern(n);

        scanner.close();
    }

    // Method to print the star pattern for n rows
    public static void printStarPattern(int n) {
        // Loop to iterate over the rows
        for (int i = 1; i <= n; i++) {
            // Print 'i' stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars in each row
            System.out.println();
        }
    }
}