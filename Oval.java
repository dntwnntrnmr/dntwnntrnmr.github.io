public class Oval extends Geometry {

    protected double a;
    protected double b;

    public Oval(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * a = bigger diagonal
     * b = lower diagonal
     */

    public double getArea() {
        return (a / 2) * (b / 2) * 3.14;
    }


    public double getPerimeter() {
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2) * 3.14 * 2;
    }

    @Override
    public void draw() {

    }
}
