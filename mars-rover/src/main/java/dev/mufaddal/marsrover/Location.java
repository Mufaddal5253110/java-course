package dev.mufaddal.marsrover;

public class Location {
    private Coordinates coordinates;
    private Direction direction;

    public Location(Coordinates coordinates, Direction direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    @Override
    public String toString() {
        return coordinates.getX() + " " + coordinates.getY() + " " + direction.toString();
    }
}
