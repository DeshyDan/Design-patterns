package BehavioralPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.Store("File", new JPEG(), new BlackFilter());

    }

}
