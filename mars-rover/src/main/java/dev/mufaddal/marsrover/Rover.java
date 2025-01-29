package dev.mufaddal.marsrover;

import java.util.List;

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

    public void processCommand(final String command) {
        final List<ICommand> commands = new StringCommandParser(command).toCommands();
        commands.forEach(c -> c.execute(this));
    }

    public String currentLocation() {
        return location.toString();
    }

    public void move() {
        Coordinates newCoordinates = this.getCurrentCoordinates().newCoordinates(
                this.getCurrentDirection().getxIncrement(),
                this.getCurrentDirection().getyIncrement());
        if (plateau.isWithinPlateauBoundary(newCoordinates)) {
            location = new Location(newCoordinates, this.getCurrentDirection());
        }
    }

    public void turnLeft() {
        location.setDirection(this.getCurrentDirection().turnLeft());
    }

    public void turnRight() {
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
