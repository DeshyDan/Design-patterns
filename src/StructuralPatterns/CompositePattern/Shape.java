package StructuralPatterns.CompositePattern;

public class Shape implements Component{

    @Override
    public void render() {
        System.out.println("Rendered the shape");
    }
}
