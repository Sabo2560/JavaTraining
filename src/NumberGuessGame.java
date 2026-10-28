import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    static void main(String[] args) {

        // RANDOM Numbers Guess Game

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = rn.nextInt(min,max + 1);

        System.out.println("NumberGuessGame.main");
        System.out.printf("Guess a number between %d - %d : \n", min, max);

        do {
            System.out.println("Enter a guess:");
            attempts++;

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter a whole number.");
                sc.next();
                continue;
            }

            guess = sc.nextInt();
            if (guess < min || guess > max) {
                System.out.printf("Number should be between %d and %d%n", min, max);
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.printf("Correct. The number was %d.%nAttempts: %d%n", guess, attempts);
            }
        } while (guess != randomNumber);
        sc.close();
    }
}

