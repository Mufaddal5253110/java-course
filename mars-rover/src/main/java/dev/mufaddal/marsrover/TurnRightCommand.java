package dev.mufaddal.marsrover;

public class TurnRightCommand implements ICommand {
    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
