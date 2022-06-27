package games.rpg.inventory;

import games.RelativePosition;
import games.rpg.points.HealthPoints;
import games.rpg.points.MagicPoints;

public abstract class Item {

    static final HealthPoints ZERO_HEALTH_POINTS = new HealthPoints(0);

    static final MagicPoints ZERO_MAGIC_POINTS = new MagicPoints(0);

    public boolean isOneTimeUse() {
        return true;
    }

    public HealthPoints prerequisiteHealth() {
        return ZERO_HEALTH_POINTS;
    }

}
