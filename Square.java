public class Square extends Rectangle {

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void draw() {
        super.draw();
    }

    public double getArea() {
        return Math.pow(a, 2);
    }

    public double getPerimeter() {
        return a * 4;
    }
}
