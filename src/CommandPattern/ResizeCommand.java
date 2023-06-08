package CommandPattern;

import CommandPattern.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
       System.out.println("Resize");
    }
    
}
