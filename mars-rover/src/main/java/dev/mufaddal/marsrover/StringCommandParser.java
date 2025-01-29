package dev.mufaddal.marsrover;

import java.util.ArrayList;
import java.util.List;

public class StringCommandParser {

    private String commandString;

    public StringCommandParser(final String commandString) {
        this.commandString = commandString;
    }

    public List<ICommand> toCommands() {
        List<ICommand> commands = new ArrayList<>();
        for (char command : commandString.toCharArray()) {
            switch (command) {
                case 'L':
                    commands.add(new TurnLeftCommand());
                    break;
                case 'R':
                    commands.add(new TurnRightCommand());
                    break;
                case 'M':
                    commands.add(new MoveCommand());
                    break;
                default:
                    throw new IllegalArgumentException("Invalid command");

            }
        }
        return commands;
    }

}
