package main.java.dev.mufaddal.marsrover;

public class Rover {

    /**
     * Unidirectional Relationships
     * Dependency Injection: Rover should receive its Plateau and Location as
     * dependencies via the constructor
     **/
    private Location location;
    private Plateau plateau;

    public Rover(Location location, Plateau plateau) {
        this.location = location;
        this.plateau = plateau;
    }

    public void processCommand(char command) {
        Command cmd = Command.fromChar(command);
        switch (cmd) {
            case LEFT -> turnLeft();
            case RIGHT -> turnRight();
            case MOVE -> move();
        }
    }

    private void move() {
        Coordinates newCoordinates = this.getCurrentCoordinates().newCoordinates(
                this.getCurrentDirection().getxIncrement(),
                this.getCurrentDirection().getyIncrement());
        if (plateau.isWithinPlateauBoundary(newCoordinates)) {
            location = new Location(newCoordinates, this.getCurrentDirection());
        }
    }

    private void turnLeft() {
        location.setDirection(this.getCurrentDirection().turnLeft());
    }

    private void turnRight() {
        location.setDirection(this.getCurrentDirection().turnRight());
    }

    // Law of Demeter
    private Coordinates getCurrentCoordinates() {
        return location.getCoordinates();
    }

    private Direction getCurrentDirection() {
        return location.getDirection();
    }

}
