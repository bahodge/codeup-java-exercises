package util;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);


    //   ############## Get String ######################
    public String getString(){
        String userInput = sc.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public String getString(String prompt){
        System.out.print(prompt);
        return sc.nextLine();

    }

    //   ############## Get Yes/No ######################

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

//   ############## Get Int ######################
    public int getInt(){
        try {
           return  Integer.valueOf(sc.next());
        } catch (NumberFormatException e){
            System.out.println("Invalid Input: :::Try again:::");
            return getInt();
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput > max || userInput < min) {
            System.out.println("Out of range");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }


    //   ############## Get Double ######################

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(){
        try {
            return Double.valueOf(sc.next());
        } catch (NumberFormatException e){
            System.out.println("OH NO: Invalid Input");
            return getDouble();
        }
    }

    public double getDouble(double min, double max){
        double userInput = getDouble();
        if (userInput > max || userInput < min) {
            System.out.println("Out of range");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }


    //   ############## Get Hexidecimal ######################
//    D
    public int getHex(){
        System.out.print("Enter Hexidecimal: ");
        String userInput = sc.next();
        try {
            return Integer.valueOf(userInput, 16);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Hexidecimal: Try again:::");
            return getHex();
        } finally {
            System.out.println(Integer.valueOf(userInput, 16));
        }
    }



}
