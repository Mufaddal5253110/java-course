package dev.mufaddal.marsrover;

// Abstraction
public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public Direction turnLeft() {
        return switch (this) {
            case NORTH -> WEST;
            case EAST -> NORTH;
            case SOUTH -> EAST;
            case WEST -> SOUTH;
        };
    }

    public Direction turnRight() {
        return switch (this) {
            case NORTH -> EAST;
            case EAST -> SOUTH;
            case SOUTH -> WEST;
            case WEST -> NORTH;
        };
    }

    public int getxIncrement() {
        return switch (this) {
            case NORTH -> 0;
            case EAST -> 1;
            case SOUTH -> 0;
            case WEST -> -1;
        };
    }

    public int getyIncrement() {
        return switch (this) {
            case NORTH -> 1;
            case EAST -> 0;
            case SOUTH -> -1;
            case WEST -> 0;
        };
    }

    @Override
    public String toString() {
        return switch (this) {
            case NORTH -> "N";
            case EAST -> "E";
            case SOUTH -> "S";
            case WEST -> "W";
        };
    }
}
