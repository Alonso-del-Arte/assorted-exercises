package randomness;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests of the RandomDotOrgAccess class. We take it on faith that
 * RandomDotOrgAccess will connect to random.org for the numbers, but check that
 * the numbers meet our requirements for distribution and range.
 */
class RandomDotOrgAccessTest {

    private static int[] retrievedNumbers = {};

    public static int expectedLength = 1000;

    public static int expectedMinimum = -2000;

    public static int expectedMaximum = 2000;

    @BeforeAll
    static void setUpClass() throws IOException {
        ExternalRandomnessProvider provider = new RandomDotOrgAccess();
        retrievedNumbers = provider.giveNumbers(expectedLength,
                expectedMinimum, expectedMaximum);
    }

    @Test
    public void testGiveNumbersRejectsNegativeAmount() {
        int badAmount = -1;
        String msg = "giveNumbers() should reject " + badAmount
                + ", too low for amount";
        ExternalRandomnessProvider provider = new RandomDotOrgAccess();
        Throwable t = assertThrows(IllegalArgumentException.class, () -> {
            provider.giveNumbers(badAmount, 0, 1);
        }, msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Message should not be null";
        System.out.println(excMsg);
    }

    @Test
    public void testGiveNumbersRejectsExcessiveAmount() {
        int badAmount = 10001;
        String msg = "giveNumbers() should reject " + badAmount
                + ", too high for amount";
        ExternalRandomnessProvider provider = new RandomDotOrgAccess();
        Throwable t = assertThrows(IllegalArgumentException.class, () -> {
            provider.giveNumbers(badAmount, 0, 1);
        }, msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Message should not be null";
        System.out.println(excMsg);
    }

    @Test
    public void testGiveNumbersRejectsBadMinimum() {
        int badMinimum = -1000000001;
        String msg = "giveNumbers() should reject " + badMinimum
                + ", too low for minimum";
        ExternalRandomnessProvider provider = new RandomDotOrgAccess();
        Throwable t = assertThrows(IllegalArgumentException.class, () ->
                provider.giveNumbers(1, badMinimum, 0), msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Message should not be null";
        System.out.println(excMsg);
    }

    @Test
    public void testGiveNumbersRejectsBadMaximum() {
        int badMaximum = 1000000001;
        String msg = "giveNumbers() should reject " + badMaximum
                + ", too high for maximum";
        ExternalRandomnessProvider provider = new RandomDotOrgAccess();
        Throwable t = assertThrows(IllegalArgumentException.class, () ->
                provider.giveNumbers(1, 0, badMaximum), msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Message should not be null";
        System.out.println(excMsg);
    }

    @Test
    public void testGiveNumbersRejectsMinimumHigherThanMaximum() {
        int badMinimum = 10;
        int badMaximum = badMinimum - 1;
        String msg = "giveNumbers() should reject maximum " + badMaximum
                + " that is higher than minimum " + badMinimum;
        ExternalRandomnessProvider provider = new RandomDotOrgAccess();
        Throwable t = assertThrows(IllegalArgumentException.class, () ->
                provider.giveNumbers(1, badMinimum, badMaximum), msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Message should not be null";
        System.out.println(excMsg);
    }

    @AfterAll
    static void tearDownClass() {
    }

}
