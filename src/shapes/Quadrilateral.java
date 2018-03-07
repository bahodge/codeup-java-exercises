package shapes;

public abstract class Quadrilateral extends Shape{
    protected double length;
    protected double width;
    protected double side;

    public Quadrilateral(double side) {
        this.side = side;
    }

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //##Abstract Setter Methods##//
    public abstract double setLength(double l);
    public abstract double setWidth(double w);

    //##Getters Methods##//
    public double getWidth() {
        return width;
    }
    public double getLength(){
        return length;
    }
}
