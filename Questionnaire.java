import java.util.Scanner;

/**
 * Calculates the amount of logs that can fit on the truck.
 *
 * @author Beni Nkongolo
 * @version 1.0
 * @since 2025-10-02
 */

final class Questionnaire {
    /**
     * For style checker.
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Questionnaire() {
        throw new IllegalStateException("Utility class");
    }

    /** Main.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctAnswer = "Battery"; // set the correct answer to "Battery"

        // Sets attempts to 0 and max attempts to 10
        int attempts = 0;
        int maxAttempts = 10;

        // Prompts user to geuss the secret word
        System.out.println("Guess the secret word! You have "
        + maxAttempts + " tries.");
        // Gives the user a hint
        System.out.println("🟩 Hint #1: It's something most"
        + "devices need to function.");

        // Starts a loop that continues until
        // the user runs out of attempts
        while (attempts < maxAttempts) {
            // Gets the user's guess
            System.out.print("Enter your guess: ");
            // Reads the user's input and trims(removes)
            // any leading/trailing whitespace
            String guess = scanner.nextLine().trim();

            // If the user has made 2 attempts
            // give them another hint
            if (attempts == 2) {
            System.out.println("🟩 Hint #2: They come in"
            + "various sizes and types.");
            }

            // If the user has made 5 attempts
            // give them another hint
            if (attempts == 5) {
            System.out.println("🟩 Hint #3: Sometimes it dies"
            + " and needs to be replaced.");
            }

            // If the user has made 8 attempts
            // give them another hint
            if (attempts == 8) {
                System.out.println("🟩 Final hint: You have one"
                + " in your tv remote.");
            }

            // Adds 1 to attempts
            attempts += 1;

            // Checks if the user's guess is correct
            // (ignores capitalization (case))
            if (guess.equalsIgnoreCase(correctAnswer)) {
                System.out.println("✅ Correct! You won"
                + " in " + attempts + " tries.");
                scanner.close();
                return;

            // If the user's guess is incorrect
            // tell them how many attempts they have left
            } else {
                System.out.println("❌ Wrong answer."
                + "Attempts left: " + (maxAttempts - attempts));
            }
        }

        // If the user runs out of attempts
        // tell them they lose and reveal the correct answer
        System.out.println("💀 You lose! The correct"
        + "answer was: " + correctAnswer);
        scanner.close();
    }
}
