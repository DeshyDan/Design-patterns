package StructuralPatterns.DecoratorPattern;

public class CloudStream implements Stream {
    public void write(String data) {
        System.out.println("Stroring" + data);

    }

}
