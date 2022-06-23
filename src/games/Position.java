package games;

public class Position {

    private final int coordX, coordY;

    // TODO: Write tests for this
    public Position offset(RelativePosition adjustment) {
        return this;
    }

    public Position(int x, int y) {
        this.coordX = x;
        this.coordY = y;
    }

}
