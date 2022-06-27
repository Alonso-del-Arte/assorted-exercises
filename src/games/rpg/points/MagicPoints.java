package games.rpg.points;

import arithmetic.Summable;

public class MagicPoints implements Comparable<MagicPoints>,
        Summable<MagicPoints> {

    /**
     * Minimum magic points (maximum deduction).
     */
    public static final int MINIMUM_POINTS = -100;

    /**
     * Minimum magic for a player to be able to use magic.
     */
    public static final int MINIMUM_POINTS_FOR_MAGIC = 1;

    /**
     * Maximum magic points.
     */
    public static final int MAXIMUM_POINTS = 100;

    private final int points;

    public int getNumber() {
        return this.points;
    }

    @Override
    public int compareTo(MagicPoints mp) {
        return 0;
    }

    @Override
    public MagicPoints plus(MagicPoints addend) {
        return new MagicPoints(this.points + addend.points);
    }

    public MagicPoints(int pts) {
        if (pts < MINIMUM_POINTS || pts > MAXIMUM_POINTS) {
            String excMsg = pts + " is outside the range " + MINIMUM_POINTS
                    + " to " + MAXIMUM_POINTS;
            throw new IllegalArgumentException(excMsg);
        }
        this.points = pts;
    }

}
