public class Main {
    public static void main(String[] args) {
        // Get the instance of Config
        Config config = Config.getInstance();

        // Access the color and weight
        String color = config.getColor();
        int weight = config.getWeight();

        // Display the retrieved values
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}
