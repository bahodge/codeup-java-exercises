import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int userInt;
        userInt = scan.nextInt();
        System.out.println("You entered ---> \"" + userInt + "\" <---");



        System.out.print("Enter Word: ");
        String wordOne = scan.next();
        System.out.print("Enter Word: ");
        String wordTwo = scan.next();
        System.out.print("Enter Word: ");
        String wordThree = scan.next();

        System.out.println("You entered ---> \"" + wordOne + " " + wordTwo + " " + wordThree + "\" <---");


        System.out.print("Enter a Sentence: ");
        String userSentence = scan.nextLine();
        System.out.println("You entered ---> \"" + userSentence + "\" <---");

        double length;
        double width;
        double height;
        double perimeter;
        double area;
        double volume;


        System.out.print("Enter a the classroom's Length, Width and Height: ");
        length = scan.nextDouble();
        width = scan.nextDouble();
        height = scan.nextDouble();

//        length = (int) length;
//        width = (int) width;
//        height = (int) height;

        perimeter  = (length * 2) + (width * 2);
        area = (length * width);
        volume = area * height;

        System.out.printf("Perimeter: " + "%.2f"  + "m" + " Area: " + "%.2f"  + "m^2" + " Volume: " + "%.2f" +"m^3" + " Length: " + "%.2f" + "m", perimeter, area, volume, length);

//
//        System.out.print("Enter Num: ");
//        int option = scan.nextInt();
//        System.out.print("Holding on to remaining number");
//        scan.nextLine();  // Consume newline left-over
//        System.out.print("Enter String: ");
//        String str1 = scan.nextLine();
//
//        System.out.println(option);
//        System.out.println(str1);

    }
}
