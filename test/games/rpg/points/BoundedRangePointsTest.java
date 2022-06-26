package games.rpg.points;

import arithmetic.Range;
import randomness.Pseudorandom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoundedRangePointsTest {

    private static final int RANGE_MINIMUM = 1;

    private static final int RANGE_MAXIMUM = 100;

    @Test
    void testPlus() {
        System.out.println("plus");
        int addendANumber = Pseudorandom.nextInt(RANGE_MAXIMUM / 2)
                + RANGE_MINIMUM;
        int addendBNumber = Pseudorandom.nextInt((RANGE_MAXIMUM - 1) / 2)
                + RANGE_MINIMUM;
        BoundedRangePointsImpl addendA
                = new BoundedRangePointsImpl(addendANumber);
        BoundedRangePointsImpl addendB
                = new BoundedRangePointsImpl(addendBNumber);
        BoundedRangePointsImpl expected
                = new BoundedRangePointsImpl(addendANumber + addendBNumber);
        BoundedRangePointsImpl actual = addendA.plus(addendB);
        assertEquals(expected, actual);
    }

    private static class BoundedRangePointsImpl
            extends BoundedRangePoints<BoundedRangePointsImpl> {

        public static final Range RANGE
                = new Range(RANGE_MINIMUM, RANGE_MAXIMUM);

        @Override
        Range getRange() {
            return RANGE;
        }

        BoundedRangePointsImpl(int points) {
            super(points);
        }

    }

}
