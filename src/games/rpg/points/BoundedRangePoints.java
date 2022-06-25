package games.rpg.points;

import arithmetic.Summable;

// TODO: Figure out elegant way to use type system so that this is an efficient
//  superclass to HealthPoints and MagicPoints
public abstract class BoundedRangePoints<T extends BoundedRangePoints<T>>
        implements Summable<T> {

    enum PointTypes { HEALTH, MAGIC }

    // TODO: Write tests for this
    @Override
    public T plus(T addend) {
        return (T) this;
    }

}
