public class Circle implements Shape {
    private double a;


    public Circle(double a) {
        this.a = a;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    @Override
    public double calculateArea() {
        System.out.print("Area of circle is: ");

        return Shape.PI * Math.pow(getA(), 2) ;

    }

    @Override
    public double calculatePerimeter() {
        System.out.print("Perimeter of circle is: ");
        return 2 * Shape.PI * getA();
    }


}
