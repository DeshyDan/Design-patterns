package CommandPattern.com;

import CommandPattern.com.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and White");
    }
    
}
