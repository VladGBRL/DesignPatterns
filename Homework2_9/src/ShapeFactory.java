public class ShapeFactory {
    public static Shape createShape(String type, double... args) {
        if (type.equalsIgnoreCase("rectangle")) {
            if (args.length != 2) {
                throw new IllegalArgumentException("Two arguments are required for a rectangle: width and height");
            }
            return new Rectangle(args[0], args[1]);
        } else if (type.equalsIgnoreCase("circle")) {
            if (args.length != 1) {
                throw new IllegalArgumentException("One argument is required for a circle: radius");
            }
            return new Circle(args[0]);
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}