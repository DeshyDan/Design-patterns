package StructuralPatterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Wrapping cloud stream in encrypted stream
        storeCreditCard(new EncrpytedCloudStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234 1234 1234 1234");
    }
}
