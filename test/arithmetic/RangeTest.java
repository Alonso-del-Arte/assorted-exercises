package arithmetic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import randomness.Pseudorandom;

class RangeTest {

    @Test
    void testGetStart() {
        System.out.println("getStart");
        int expected = 2 * Pseudorandom.nextInt(256) + 1;
        int end = expected + 2 * Pseudorandom.nextInt(256) + 2;
        int step = 1;
        Range range = new Range(expected, end, step);
        int actual = range.getStart();
        assertEquals(expected, actual);
    }

    @Test
    void testGetEnd() {
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

    @Test
    void testToString() {
        System.out.println("toString");
        int start = 2 * Pseudorandom.nextInt(256) + 1;
        int end = start + 2 * Pseudorandom.nextInt(256) + 2;
        int step = 2;
        Range range = new Range(start, end, step);
        String expected = start + " to " + end + " by " + step;
        String actual = range.toString();
        assertEquals(expected, actual);
    }

    @Test
    void testToStringOmitsStepOne() {
        int start = Pseudorandom.nextInt(1024) + 1;
        int end = start + Pseudorandom.nextInt(1024) + 1;
        Range range = new Range(start, end, 1);
        String expected = start + " to " + end;
        String actual = range.toString();
        assertEquals(expected, actual);
    }

    @Test
    void testAuxiliaryConstructorInfersNegativeOneStep() {
        int start = Pseudorandom.nextInt(256);
        int end = -start - Pseudorandom.nextInt(256) - 1;
        Range range = new Range(start, end);
        String msg = "Range that starts at " + start + " and ends at " + end
                + " should be inferred to have a step of -1";
        assertEquals(-1, range.getStep(), msg);
    }

    @Test
    void testAuxiliaryConstructorInfersPositiveOneStep() {
        int start = -Pseudorandom.nextInt(256);
        int end = -start + Pseudorandom.nextInt(256) + 1;
        Range range = new Range(start, end);
        String msg = "Range that starts at " + start + " and ends at " + end
                + " should be inferred to have a step of 1";
        assertEquals(1, range.getStep(), msg);
    }

}
