public class CaseSwapper {
    public static void main(String[] args) {
        String input = "The QuiCk BrOwN Fox";
        String swapped = swapCase(input);
        System.out.println("Original: " + input);
        System.out.println("Swapped : " + swapped);
    }

    // Method to swap case of each character in the string
    public static String swapCase(String str) {
        StringBuilder swappedString = new StringBuilder();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // Convert uppercase to lowercase
                swappedString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                // Convert lowercase to uppercase
                swappedString.append(Character.toUpperCase(c));
            } else {
                // If it's neither, just append the character as is
                swappedString.append(c);
            }
        }

        return swappedString.toString();
    }
}