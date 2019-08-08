public class Triangle implements Shape {
    private double a;
    private double h;

    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateArea() {
        System.out.print("Area of triangle: ");
        return (getA()*getH())/2D;
    }

    @Override
    public double calculatePerimeter() {
        System.out.print("Perimeter of triangle: ");
        return 3D * getA();
    }
}
