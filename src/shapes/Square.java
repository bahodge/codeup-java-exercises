package shapes;

public class Square extends Rectangle {
    private double squareSide;

    public Square(double side) {
        super(side, side);
        this.squareSide = side;
    }

    public double getArea(){
        return squareSide * squareSide;
    }

    public double getPerimeter(){
        return squareSide * 4;
    }

    public double getSquareSide() {
        return squareSide;
    }
}
