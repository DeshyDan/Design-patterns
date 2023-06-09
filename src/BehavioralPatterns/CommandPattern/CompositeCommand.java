package BehavioralPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

import BehavioralPatterns.CommandPattern.fx.Command;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(command -> {
            command.execute();
        });
    }

}
