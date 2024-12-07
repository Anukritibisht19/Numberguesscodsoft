import java.util.Scanner;
import java.util.Random;
                        //Java Programming Internship Task 1 by  ANUKRITI BISHT	
public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;
                    //Java Programming Internship Task 1 by  ANUKRITI BISHT
        System.out.println("You are Welcome to My Number Guessing Game!");

        do {
            int NumberThought = random.nextInt(maxRange - minRange + 1) + minRange;
            int userGuess;
            boolean Guessed = false;

            System.out.println("\nI had thought a number between " + minRange + " and " + maxRange + ". Guess it!");

            for (int attempts = 1; attempts <= maxAttempts; attempts++) {
                System.out.print("Attempt " + attempts + ": Enter your guessed number: ");
                userGuess = scanner.nextInt();

                if (userGuess == NumberThought) {
                    System.out.println("WOW! You guessed the correct number.");
                    Guessed = true;
                    score += maxAttempts - (attempts - 1);
                    break;
                } else if (userGuess < NumberThought) {
                    System.out.println("Too low! ");
                } else {
                    System.out.println("Too high! ");
                }
            }

            if (!Guessed) {
                System.out.println("SORRY, Your Attempts are over. The correct number was: " + NumberThought);
            }

            System.out.print(" Want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks  Your total score is: " + score);
        scanner.close();
    }
}           //Java Programming Internship Task 1 by  ANUKRITI BISHT	