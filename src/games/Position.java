package games;

public class Position {

    private final int coordX, coordY;

    @Override
    public String toString() {
        return "(" + this.coordX + ", " + this.coordY + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }
        return this.coordX == ((Position) obj).coordX;
    }

    // TODO: Write tests for this
    @Override
    public int hashCode() {
        return 0;
    }

    // TODO: Write tests for this
    public Position offset(RelativePosition adjustment) {
        return this;
    }

    public Position(int x, int y) {
        this.coordX = x;
        this.coordY = y;
    }

}
