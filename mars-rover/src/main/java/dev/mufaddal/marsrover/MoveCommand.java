package main.java.dev.mufaddal.marsrover;

public class MoveCommand implements ICommand{
    @Override
    public void execute(Rover rover) {
        rover.move();
    }
}
