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

}