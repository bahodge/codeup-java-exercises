package lecnotes.exceptions;

public class ExceptionLec {
    public static void main(String[] args){
//        ---------------------------------------
//        throw new RuntimeException("OH NOOOO");
//        ---------------------------------------
//  //TODO       How to handle the exception
//        try {
//            boolean badThingHappend = true;
//            if (badThingHappend) {
//                throw new Exception("Exception: badThingHappened = true");
//            }
//            System.out.println("Only runs if false");
//        }catch (Exception e){
//                System.out.println("You did x and it broke");
//                System.out.println(e.getMessage());
//                e.printStackTrace();
//            }
//        }
//        ---------------------------------------
// //TODO        Breaks the program and causes crash
//        int result = 1/0;
//        ---------------------------------------
////TODO       Lets the code try to run, throws an exception but the program keeps going.
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
////TODO             Be specific with type of exception thrown
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//            System.out.println(e.toString());
//        }
//        System.out.println("This will still run");


//        ---------------------------------------
//        int[] numbers = {1,2,3};
//        int x;
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception caught!");
//            x=0;
//        } catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            System.out.println("This will always run");
//        }
//        System.out.println("This will run runs!");


//        ---------------------------------------
//        try {
//            double result;
//            String[] strings = {"Bob", "Fred", "Sally"};
//            System.out.println(strings[3]);
//        } catch (ArithmeticException e){
//            System.out.println(e.toString());
//        } catch (Exception e){
//            System.out.println("This won't run");
//            System.out.println(e.toString());
//        } finally {
//            System.out.println("This always runs!");
//        }


    }
}
