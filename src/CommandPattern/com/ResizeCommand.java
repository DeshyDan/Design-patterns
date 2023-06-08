package CommandPattern.com;

import CommandPattern.com.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
       System.out.println("Resize");
    }
    
}
