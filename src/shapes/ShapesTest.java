package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        printShapes(box1);

        Rectangle box2 = new Square(5);
        printShapes(box2);

        Square box3 = new Square(4);
        printShapes(box3);
    }

    public static void printShapes(Rectangle box){
        System.out.println("Area: " + box.getArea());
        System.out.println("Perimeter: " + box.getPerimeter() + "\n");
    }
    public static void printShapes(Square box){
        System.out.println("Area: " + box.getArea());
        System.out.println("Perimeter: " + box.getPerimeter());
        System.out.println("Side: " + box.getSquareSide());
    }
}
