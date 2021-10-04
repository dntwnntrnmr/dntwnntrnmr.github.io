public class Rhombus extends Rectangle {

    public Rhombus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * a = bigger diagonal
     * b = lower diagonal
     */
    @Override
    public double getArea() {
        return (a * b) / 2;
    }


    public double getPerimeter() {
        double side = Math.sqrt(Math.pow(a / 2, 2) + Math.pow(b / 2, 2));
        return side * 4;
    }
}
