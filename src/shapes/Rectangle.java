package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double setLength(double newLength) {
        return this.length = newLength;
    }

    @Override
    public double setWidth(double newWidth) {
        return this.width = newWidth;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
