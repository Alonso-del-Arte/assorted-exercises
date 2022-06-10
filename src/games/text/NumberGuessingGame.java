package games.text;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NumberGuessingGame {

    static final int MINIMUM_NUMBER = 1;

    static final int MAXIMUM_NUMBER = 20;

    static final int SPAN = MAXIMUM_NUMBER - MINIMUM_NUMBER;

    static final int MAXIMUM_GUESS_COUNT = 6;

    private static Scanner scanner;

    private static String playerName;

    static int thinkOfNumber() {
        return -20;// (int) Math.floor(Math.random() * SPAN) + MINIMUM_NUMBER;
    }

    private static void playRound() {
        int number = thinkOfNumber();
        System.out.println("Well, " + playerName
                + ", I'm thinking of a number between " + MINIMUM_NUMBER
                + " and " + MAXIMUM_NUMBER);
        int guessCount = 0;
        boolean guessedIt = false;
        while (guessCount < MAXIMUM_GUESS_COUNT && !guessedIt) {
            System.out.println("Take a guess.");
            try {
                String possibleGuess = scanner.next();
                guessCount++;
                int guess = Integer.parseInt(possibleGuess);
                int comparison = Integer.signum(Integer.compare(guess, number));
                switch (comparison) {
                    case -1:
                        System.out.println("Your guess is too low");
                        break;
                    case 0:
                        guessedIt = true;
                        System.out.println("Good job, " + playerName
                                + "! You guessed my number in " + guessCount
                                + " guesses!");
                        break;
                    case 1:
                        System.out.println("Your guess is too high");
                        break;
                    default:
                        String excMsg = "Unexpected comparison " + comparison;
                        throw new NoSuchElementException(excMsg);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("I'm sorry, I don't understand "
                        + nfe.getMessage());
                int guessesLeft = MAXIMUM_GUESS_COUNT - guessCount + 1;
                guessCount--;
                System.out.println("No penalty, though, you still have "
                        + guessesLeft + " guesses left");
            }
        }
        if (!guessedIt) {
            System.out.println("Sorry, the number was " + number);
        }
    }

    public static void main(String[] args) {
        System.out.println("Number Guessing Game");
        scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        playerName = scanner.next();
        boolean keepPlaying = true;
        while (keepPlaying) {
            playRound();
            System.out.println("Would you like to play again? (y/n)");
            String response = scanner.next().toLowerCase();
            keepPlaying = response.startsWith("y");
        }
        scanner.close();
    }

}
