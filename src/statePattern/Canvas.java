package statePattern;

public class Canvas {
    private Tool tool;

   
    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public String mouseUp() {
        return tool.mouseUp();
    }

    public String mouseDown() {
        return tool.mouseDown();
    }

}
