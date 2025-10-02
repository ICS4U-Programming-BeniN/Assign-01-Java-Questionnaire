import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctAnswer = "openai"; // you can change this to anything
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("Guess the secret word! You have " + maxAttempts + " tries.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine().trim();

            attempts++;

            if (guess.equalsIgnoreCase(correctAnswer)) {
                System.out.println("✅ Correct! You won in " + attempts + " tries.");
                scanner.close();
                return;
            } else {
                System.out.println("❌ Wrong answer. Attempts left: " + (maxAttempts - attempts));
            }
        }

        System.out.println("💀 You lose! The correct answer was: " + correctAnswer);
        scanner.close();
    }
}
