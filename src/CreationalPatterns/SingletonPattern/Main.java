package CreationalPatterns.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("Hello", "There");
        ConfigManager otherManager = ConfigManager.getInstance();

        System.out.println(otherManager.get("Hello"));
        

    }
}
