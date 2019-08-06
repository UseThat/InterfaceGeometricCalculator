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
        return 2 * Shape.PI * getA();
    }

    @Override
    public double calculateParimiter() {
        return Shape.PI * Math.pow(getA(), 2);
    }


}
