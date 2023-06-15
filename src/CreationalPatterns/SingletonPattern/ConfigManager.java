package CreationalPatterns.SingletonPattern;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Object> settings = new HashMap<>();
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager() {
    }

    public void set(String key, String value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }

    public static ConfigManager getInstance() {
        return instance;
    }

}
