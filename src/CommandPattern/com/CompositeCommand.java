package CommandPattern.com;

import java.util.ArrayList;
import java.util.List;

import CommandPattern.com.fx.Command;

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
