public class Plateau {
    private int topRightX;
    private int topRightY;

    public Plateau(int topRightX, int topRightY) {
        this.topRightX = topRightX;
        this.topRightY = topRightY;
    }

    public int getTopRightX() {
        return topRightX;
    }

    public int getTopRightY() {
        return topRightY;
    }

    public boolean isWithinPlateauBoundary(Coordinates coordinates) {
        return coordinates.getX() >= 0 && coordinates.getX() <= topRightX && coordinates.getY() >= 0
                && coordinates.getY() <= topRightY;
    }
}