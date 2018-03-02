package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        do {
            System.out.println("\n");
            Circle c1 = new Circle(input.getDouble());
            System.out.printf("\nThe Area of the circle with a radius of " + "%.3f" + " is " + "%.3f", c1.getRadius() , c1.getArea());

            System.out.printf("\n\nThe Circumference of the circle with a radius of " + "%.3f" + " is " + "%.3f", c1.getRadius() , c1.getCircumference());

            System.out.println("\n\n\n");
        } while (input.yesNo());

    }
}
