package shapes;

public class Square extends Quadrilateral{
    private double sqSide;

    public Square(double side) {
        super(side);
        this.sqSide = side;
    }

    @Override
    public double setLength(double newLength) {
        return this.length = newLength;
    }

    @Override
    public double setWidth(double newWidth) {
        return this.width = newWidth;
    }

    @Override
    public double getPerimeter() {
        return sqSide * 4;
    }

    @Override
    public double getArea() {
        return sqSide * sqSide;
    }
}
