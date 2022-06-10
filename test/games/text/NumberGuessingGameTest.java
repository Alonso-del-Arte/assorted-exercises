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

}