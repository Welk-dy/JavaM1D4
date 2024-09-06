import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Output: Print the multiplication table up to n x n
        printMultiplicationTable(n);

        scanner.close();
    }

    // Method to print the multiplication table up to n x n
    public static void printMultiplicationTable(int n) {
        // Loop to iterate over the rows
        for (int i = 1; i <= n; i++) {
            // Loop to iterate over the columns
            for (int j = 1; j <= n; j++) {
                // Print the product of i and j
                System.out.print(i * j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}