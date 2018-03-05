package util;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public String getString(){
        String userInput = sc.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public String getString(String prompt){
        System.out.print(prompt);
        return sc.nextLine();

    }

    public boolean yesNo(){
        String userAns = sc.next();
        if (userAns.equalsIgnoreCase("y") || userAns.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }




    public int getInt(){
        return sc.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min) {
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    public double getDouble(double min, double max){
        double userInput = sc.nextDouble();
        if (userInput > max || userInput < min) {
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public double getDouble(){
        double userInput = sc.nextDouble();
        return userInput;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }



}
