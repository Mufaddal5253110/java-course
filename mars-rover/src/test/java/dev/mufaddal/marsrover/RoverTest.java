package dev.mufaddal.marsrover;

import dev.mufaddal.marsrover.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void testRoverCurrentLocation() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        assertEquals("3 3 N", rover.currentLocation());
    }

    @Test
    public void testRoverTrunLeft() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.turnLeft();

        assertEquals("3 3 W", rover.currentLocation());
    }

    @Test
    public void testRoverTrunRight() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.turnRight();

        assertEquals("3 3 E", rover.currentLocation());
    }

    @Test
    public void testRoverMove() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.move();

        assertEquals("3 4 N", rover.currentLocation());
    }

    @Test
    public void testRoverRunCommandToTurnRight() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.processCommand("R");

        assertEquals("3 3 E", rover.currentLocation());
    }

    @Test
    public void testRoverRunCommandToTurnLeft() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.processCommand("L");

        assertEquals("3 3 W", rover.currentLocation());
    }

    @Test
    public void testRoverRunCommandToMove() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.processCommand("M");

        assertEquals("3 4 N", rover.currentLocation());
    }

    @Test
    public void testRoverMultipleCommands() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(1, 2);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.processCommand("LMLMLMLMM");

        assertEquals("1 3 N", rover.currentLocation());
    }

    @Test
    public void testRoverGoBeyondPlateu() {
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.processCommand("MMMMMMMMMMR");

        assertEquals("3 5 E", rover.currentLocation());
    }
}
