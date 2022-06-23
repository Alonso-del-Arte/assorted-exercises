package games;

public class Position {

    private final int coordX, coordY;

    @Override
    public String toString() {
        return "(" + this.coordX + ", " + this.coordY + ")";
    }

    // TODO: Write tests for this
    @Override
    public boolean equals(Object obj) {
        return false;
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
