package dev.mufaddal.marsrover;

// Abstraction
public enum Command {
    LEFT, RIGHT, MOVE;

    public static Command fromChar(char command) {
        return switch (command) {
            case 'L' -> LEFT;
            case 'R' -> RIGHT;
            case 'M' -> MOVE;
            default -> throw new IllegalArgumentException("Invalid Command: " + command);
        };
    }
}
