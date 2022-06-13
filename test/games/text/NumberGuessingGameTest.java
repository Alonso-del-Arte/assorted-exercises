package games.text;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberGuessingGameTest {

    @Test
    void testThinkOfNumberAtLeastMinimum() {
        int size = 20;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = NumberGuessingGame.thinkOfNumber();
            String msg = "Thought of number " + numbers[i]
                    + " ought to be at least "
                    + NumberGuessingGame.MINIMUM_NUMBER;
            assert numbers[i] >= NumberGuessingGame.MINIMUM_NUMBER : msg;
        }
    }

    @Test
    void testThinkOfNumberAtMostMaximum() {
        int size = 20;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = NumberGuessingGame.thinkOfNumber();
            String msg = "Thought of number " + numbers[i]
                    + " ought to be at most "
                    + NumberGuessingGame.MAXIMUM_NUMBER;
            assert numbers[i] <= NumberGuessingGame.MAXIMUM_NUMBER : msg;
        }
    }

    @Test
    void testThinkOfNumber() {
        System.out.println("thinkOfNumber");
        final int minimumOccurrencesPerNumber = 2;
        final int averageTriesPerNumber = 5 * minimumOccurrencesPerNumber;
        final int maximumOccurrencesPerNumber = 3 * averageTriesPerNumber;
        final int sampleSize = averageTriesPerNumber * NumberGuessingGame.SPAN;
        int[] occurrenceCounts = new int[NumberGuessingGame.MAXIMUM_NUMBER];
        for (int i = 0; i < sampleSize; i++) {
            occurrenceCounts[NumberGuessingGame.thinkOfNumber() - 1]++;
        }
        for (int j = NumberGuessingGame.MINIMUM_NUMBER;
             j < NumberGuessingGame.MAXIMUM_NUMBER; j++) {
            int occurrences = occurrenceCounts[j - 1];
            String msg = "Number " + j + " occurred " + occurrences
                    + " time(s), it should have occurred at least "
                    + minimumOccurrencesPerNumber + " times but not more than "
                    + maximumOccurrencesPerNumber + " times";
            assert occurrences >= minimumOccurrencesPerNumber : msg;
            assert occurrences <= maximumOccurrencesPerNumber : msg;
        }
    }

}