public class Circle extends Oval {

    public Circle(double a, double b) {
        super(a, b);
    }

    /**
     * a = diameter
     */

    @Override
    public double getArea() {
        return Math.pow(a, 2) / 4 * 3.14;
    }

    @Override
    public double getPerimeter() {
        return a * 3.14;
    }

    @Override
    public void draw() {
        super.draw();
    }

}
