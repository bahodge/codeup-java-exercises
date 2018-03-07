package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Shape myShortBoi = new Square(8);
        Shape myLongBoi = new Rectangle(5, 6);

        System.out.println("Square: Area - " + myShortBoi.getArea());
        System.out.println("Square: Perimeter - " + myShortBoi.getPerimeter());
        System.out.println("Rectangle: Area - " + myLongBoi.getArea());
        System.out.println("Rectangle: Perimeter - " + myLongBoi.getPerimeter());
    }


}
