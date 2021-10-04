public class Rectangle extends Geometry {

    protected double a;
    protected double b;


    @Override
    public double getArea() {
        return a * b;
    }


    public double getPerimeter() {
        return (a + b) * 2;
    }



    @Override
    public void draw() {

    }
}
