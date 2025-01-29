package dev.mufaddal.marsrover;

import dev.mufaddal.marsrover.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoverTest {

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
    public void testRoverMove(){
        Coordinates coordinates = new Coordinates(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Plateau plateau = new Plateau(coordinates);
        Direction direction = Direction.NORTH;
        Location location = new Location(startingCoordinates, direction);
        Rover rover = new Rover(location, plateau);

        rover.move();

        assertEquals("3 4 N", rover.currentLocation());
    }
}
