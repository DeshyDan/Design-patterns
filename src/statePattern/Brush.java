package statePattern;

public class Brush implements Tool {

    @Override
    public String mouseDown() {
       
        return "Brush MouseDown";
    }

    @Override
    public String mouseUp() {
        return "Brush MouseUp";

    }

}
