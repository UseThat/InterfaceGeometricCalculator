public class ShapeCalculatorApp {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(35.3);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
        shape = new Rectangle(5);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }

}
