public class Main {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape("rectangle", 5.0, 4.0);
        Shape circle = ShapeFactory.createShape("circle", 3.0);

        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}