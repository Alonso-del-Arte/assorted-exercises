package games.rpg.points;

import arithmetic.Range;

// TODO: Figure out elegant way to use type system so that this is an efficient
//  superclass to HealthPoints and MagicPoints
public abstract class BoundedRangePoints<T extends BoundedRangePoints<T>> {

    final int score;

    abstract Range getRange();

    // TODO: Write tests for this
    public <S extends BoundedRangePoints<S>> S plus(T addend) {
        return (S) this;
    }

    BoundedRangePoints(int points) {
        this.score = points;
    }

}
