package randomness;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests of the RandomDotOrgAccess class. We take it on faith that
 * RandomDotOrgAccess will connect to random.org for the numbers, but check that
 * the numbers meet our requirements for distribution and range.
 */
class RandomDotOrgAccessTest {

    private int[] retrievedNumbers = {};

    public int expectedLength = 1000;

    public int expectedMinimum = -2000;

    public int expectedMaximum = 2000;

    @BeforeAll
    void setUpClass() throws IOException {
        ExternalRandomnessProvider provider = new RandomDotOrgAccess();
        this.retrievedNumbers = provider.giveNumbers(expectedLength,
                expectedMinimum, expectedMaximum);
    }

    @AfterAll
    void tearDownClass() {
    }

}
