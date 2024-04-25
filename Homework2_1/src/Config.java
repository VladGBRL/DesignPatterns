import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Config {
    private static Config instance;
    private String color;
    private int weight;
    private boolean initialized;

    private Config() {}

    public static synchronized Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private void readConfigFile() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/Config.json")));
            JSONObject jsonObject = new JSONObject(content);
            color = jsonObject.getString("color");
            weight = jsonObject.getInt("weight");
            initialized = true;
        } catch (IOException e) {
            System.err.println("Error reading config file: " + e.getMessage());

            System.err.println("Error parsing config file: " + e.getMessage());
        }
    }

    public String getColor() {
        if (!initialized) {
            readConfigFile();
        }
        return color;
    }

    public int getWeight() {
        if (!initialized) {
            readConfigFile();
        }
        return weight;
    }
}
