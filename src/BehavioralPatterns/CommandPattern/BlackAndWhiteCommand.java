package BehavioralPatterns.CommandPattern;

import BehavioralPatterns.CommandPattern.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and White");
    }
    
}
