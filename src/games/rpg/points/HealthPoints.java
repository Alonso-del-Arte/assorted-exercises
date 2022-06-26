package games.rpg.points;

import arithmetic.Summable;

public class HealthPoints implements Summable<HealthPoints> {

    /**
     * Minimum health points (maximum deduction).
     */
    public static final int MINIMUM_POINTS = -100;

    /**
     * Minimum health for a player to be considered alive (active) in the game.
     */
    public static final int MINIMUM_POINTS_FOR_ALIVE = 1;

    /**
     * Maximum health points.
     */
    public static final int MAXIMUM_POINTS = 100;

    private final int points;

    public int getNumber() {
        return this.points;
    }

    @Override
    public HealthPoints plus(HealthPoints addend) {
        return new HealthPoints(this.points + addend.points);
    }

    public HealthPoints(int pts) {
        if (pts < MINIMUM_POINTS || pts > MAXIMUM_POINTS) {
            String excMsg = pts + " is outside the range " + MINIMUM_POINTS
                    + " to " + MAXIMUM_POINTS;
            throw new IllegalArgumentException(excMsg);
        }
        this.points = pts;
    }

}
