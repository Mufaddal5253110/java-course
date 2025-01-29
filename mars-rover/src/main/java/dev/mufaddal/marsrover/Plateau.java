package dev.mufaddal.marsrover;

public class Plateau {
    private Coordinates boundaryCoordinates;

    public Plateau(Coordinates boundaryCoordinates) {
        this.boundaryCoordinates = boundaryCoordinates;
    }

    // Tell, Don’t Ask
    public boolean isWithinPlateauBoundary(Coordinates coordinates) {
        return coordinates.getX() >= 0 && coordinates.getX() <= this.boundaryCoordinates.getX()
                && coordinates.getY() >= 0
                && coordinates.getY() <= this.boundaryCoordinates.getY();
    }
}