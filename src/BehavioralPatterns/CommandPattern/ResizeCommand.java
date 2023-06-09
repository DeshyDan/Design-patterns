package BehavioralPatterns.CommandPattern;

import BehavioralPatterns.CommandPattern.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
       System.out.println("Resize");
    }
    
}
