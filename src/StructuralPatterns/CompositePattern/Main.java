package StructuralPatterns.CompositePattern;

public class Main {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape()); // Sqaure
        group1.add(new Shape()); // Sqaure

        var group2 = new Group();
        group2.add(new Shape()); // circle
        group2.add(new Shape()); // circle

        group2.add(group1);

        group2.render();
    }
}
