package util;
import java.util.Random;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
    private Random rand = new Random();


    public String getString(){
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public boolean yesNo(){
            System.out.print("Enter [y||yes] to continue:  ");
            String userAns = sc.next();

            if (userAns.equalsIgnoreCase("y") || userAns.equalsIgnoreCase("yes")){
                System.out.println("User Typed y/yes: True");
                return true;
            } else {
                System.out.println("User typed y/yes: False");
                return false;
            }
    }


    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ":  ");
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min) {
            System.out.println("No silly! BETWEEEEEEN! ");
            return getInt(min, max);
        }
            return userInput;
    }

    public int getInt(){
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();
        System.out.println("Entered: " + userInput);
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.print("Enter a number between " + min + " and " + max + ":  ");
        double userInput = sc.nextDouble();
        if (userInput > max || userInput < min) {
            System.out.println("No silly! BETWEEEEEEN! ");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(){
        System.out.print("Enter a double(decimal): ");
        double userInput = sc.nextDouble();
        System.out.println("Entered: " + userInput);
        return userInput;
    }




}
