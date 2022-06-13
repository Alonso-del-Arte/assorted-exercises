package randomness;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PseudorandomTest {

    @Test
    void testFlipCoin() {
        final int tries = 1000;
        final int minimumExpectation = 3 * tries / 10;
        final int maximumExpectation = 7 * tries / 10;
        int headCount = 0;
        int tailCount = 0;
        for (int i = 0; i < tries; i++) {
            CoinSide side = Pseudorandom.flipCoin();
            if (side.equals(CoinSide.HEADS)) {
                headCount++;
            } else {
                tailCount++;
            }
        }
        String msg = "Flipped heads " + headCount + " times, tails " + tailCount
                + " times, should be at least " + minimumExpectation
                + " times, at most " + maximumExpectation + " times";
        assert headCount >= minimumExpectation : msg;
        assert headCount <= maximumExpectation : msg;
        assert tailCount >= minimumExpectation : msg;
        assert tailCount <= maximumExpectation : msg;
    }

}
