package arithmetic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import randomness.Pseudorandom;

class RangeTest {

    @Test
    public void testGetStart() {
        System.out.println("getStart");
        int expected = 2 * Pseudorandom.nextInt(256) + 1;
        int end = expected + 2 * Pseudorandom.nextInt(256) + 2;
        int step = 1;
        Range range = new Range(expected, end, step);
        int actual = range.getStart();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        int start = 2 * Pseudorandom.nextInt(256) + 1;
        int expected = start + 2 * Pseudorandom.nextInt(256) + 2;
        int step = 1;
        Range range = new Range(start, expected, step);
        int actual = range.getEnd();
        assertEquals(expected, actual);
    }

    @Test
    void testGetStep() {
        System.out.println("getStep");
        int expected = Pseudorandom.nextInt(20) + 1;
        int start = expected * (Pseudorandom.nextInt(256) + 1);
        int end = start + expected * Pseudorandom.nextInt(256);
        Range range = new Range(start, end, expected);
        int actual = range.getStep();
        assertEquals(expected, actual);
    }

}
