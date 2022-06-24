package games;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import randomness.Pseudorandom;

class PositionTest {

    @Test
    void testToString() {
        System.out.println("toString");
        int x = Pseudorandom.nextInt(32) - 16;
        int y = Pseudorandom.nextInt(32) - 16;
        Position position = new Position(x, y);
        String expected = "(" + x + "," + y + ")";
        String actual = position.toString().replace(" ", "");
        assertEquals(expected, actual);
    }

    @Test
    void testReferentialEquality() {
        int x = Pseudorandom.nextInt(32) - 16;
        int y = Pseudorandom.nextInt(32) - 16;
        Position position = new Position(x, y);
        assertEquals(position, position);
    }

    @Test
    void testNotEqualsNull() {
        int x = Pseudorandom.nextInt(32) - 16;
        int y = Pseudorandom.nextInt(32) - 16;
        Position position = new Position(x, y);
        String msg = "Position " + position + " should not equal null";
        assert !position.equals(null) : msg;
    }

    @Test
    void testNotEqualsDiffClass() {
        int x = Pseudorandom.nextInt(32) - 16;
        int y = Pseudorandom.nextInt(32) - 16;
        Position absPos = new Position(x, y);
        RelativePosition relPos = new RelativePosition(x, y);
        assertNotEquals(absPos, relPos);
    }

    @Test
    void testNotEqualsDiffX() {
        int x = Pseudorandom.nextInt(32) - 16;
        int y = Pseudorandom.nextInt(32) - 16;
        Position positionA = new Position(x, y);
        Position positionB = new Position(x + 1, y);
        assertNotEquals(positionA, positionB);
    }

}