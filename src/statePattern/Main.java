package statePattern;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setTool(new Brush());
        System.out.println(canvas.mouseDown());
        System.out.println(canvas.mouseUp());

        canvas.setTool(new Selection());
        System.out.println(canvas.mouseDown());
        System.out.println(canvas.mouseUp());
    }
}
