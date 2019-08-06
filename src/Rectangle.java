public class Rectangle implements Shape {
    private double a;


    public Rectangle(double a) {
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
        System.out.print("Area of rectangle is ");
        return Math.pow(getA(),2);
    }

    @Override
    public double calculatePerimeter() {
        System.out.print("Perimeter of rectangle is ");
        return getA()*4;
    }


}
