import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 6;

        System.out.println("addNums result: " + addNums(num1, num2));
        System.out.println("subNums result: " + subNums(num1, num2));
        System.out.println("mulitiplyNums result: " + multiplyNums(num1, num2));
        System.out.println("divideNums result: " + divideNums(num1, num2));
        System.out.println("modulusNums result: " + modulusNums(num1, num2));
        System.out.println("multiplyWithAdd result: " +multiplyWithAdd(num1,num2));
//        System.out.println(getRange(1, 10));

        System.out.println("getFactorial result: " + getFactorial(10));






    }

    //add
    public static int addNums(int a, int b){
        return a + b;
    }


    //subtract
    public static int subNums(int a, int b){
        return a - b;
    }

    //multiply
    public static int multiplyNums(int a, int b){
        return a * b;
    }

    //divide
    public static int divideNums(int a, int b){
        if (a != 0 && b != 0){
            return a / b;
        } else {
           System.out.println("Can't divide by 0");
           return 0;
        }
    }

    //modulus
    public static int modulusNums(int a, int b){
        if (a != 0 && b != 0){
            return a % b;
        } else {
            System.out.println("Can't modulo 0");
            return 0;
        }
    }

    //multiply without *
    public static int multiplyWithAdd(int a, int b){
        int c = a;
        for (int i = 1; i < b; i++){
            a += c;
        }
        return a;
    }

    //Valid range //Terrible method :(
    public static int getRange(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 & 10: ");
        int userInput = scan.nextInt();
        if ((userInput >= min && userInput <= max ) && (userInput >= min && userInput <= max)){
            System.out.println(userInput + " in range | Pick a new number!");
            getRange(min, max);
        } else {
            System.out.println(userInput + " Input out of range");
        }
        System.out.print("Shutting down range function: ");
        return 0;
    }

    public static long getFactorial(long a){
        long b = a;
        String output = "";
        output += b + "! = " + b;
        for (long i = a-1; i >= 1; i--){

            output += " x " + i;
            System.out.println(output);
            a*=i;
        }

        System.out.println(output += " = " + a);
        return a;
    }



}