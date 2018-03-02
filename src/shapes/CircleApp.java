package shapes;
import util.Input;

import java.util.Arrays;

public class CircleApp {
    public static void main(String[] args) {


        int[] myNums = {1,2,3,4,5};

//
//        for (int i = 0; i < myNums.length; i++){
//            System.out.println(myNums[i]);
//        }

        for (int element : myNums) {
            System.out.println(element);
        }


//
//        Arrays.fill(myNums, 0, 2, 100);
//
//        for (int i = 0; i < myNums.length; i++){
//            System.out.println(myNums[i]);
//        }



//        Input input = new Input();
//
//        do {
//            System.out.println("\n");
//            Circle c1 = new Circle(input.getDouble());
//            System.out.printf("\nThe Area of the circle with a radius of " + "%.3f" + " is " + "%.3f", c1.getRadius() , c1.getArea());
//
//            System.out.printf("\n\nThe Circumference of the circle with a radius of " + "%.3f" + " is " + "%.3f", c1.getRadius() , c1.getCircumference());
//
//            System.out.println("\n\n\n");
//        } while (input.yesNo());

    }
}
