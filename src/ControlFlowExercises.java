import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //While Loop

        System.out.println("####### WHILE LOOPS ###########");
        System.out.println("####### #1 ###########");
        int i = 5;

        while (i <= 15){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        System.out.println();


        //Do-While Loop
        System.out.println("####### DO - WHILE LOOPS ###########");
        System.out.println("####### #1 ###########");
        int j = 100;
        do {
            j -= 5;
            System.out.println(j);
        } while (j > -10);


        System.out.println();

        System.out.println("####### #2 ###########");
        double k = 2;
        do {
            System.out.println((int)k);
            k = Math.pow(k, 2);

        } while (k < 1000000);


        System.out.println();
        System.out.println();
        //For Loop
        System.out.println("####### FOR LOOPS ###########");
        System.out.println("####### #1 ###########");
        for (int l = 100; l >= -10; l-=5){
            System.out.println(l);
        }

        for (double p = 2; p < 1000000; p = Math.pow(p, 2)){
            System.out.println(p);
        }


        System.out.println();

        System.out.println("####### #2 ###########");
        for (int q = 1; q <= 100; q++){
            if (q % 15 == 0){
                System.out.println("Fizzbuzz");
                continue;
            } else if (q % 5 == 0){
                System.out.println("Buzz");
                continue;
            } else if (q % 3 == 0){
                System.out.println("Fizz");
                continue;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

//        Print a table
        System.out.println("####### CREATE A TABLE ###########");
        Scanner scan = new Scanner(System.in);
        boolean userCont;
        String userAns;

        do {
            System.out.print("Enter your min value: ");
            int userLow = scan.nextInt();
            System.out.print("Enter your high value: ");
            int userHigh = scan.nextInt();
            System.out.println("+--------|---------|-------+");
            System.out.println("| Number | Squared | Cubed |");
            System.out.println("+--------|---------|-------+");

            for (int q = userLow; q <= userHigh; q++){
                System.out.printf("| %-6d | %-7d | %-5d |", q, (int)Math.pow(q, 2), (int)Math.pow(q, 3));
//                System.out.printf("%-7d" + '|' +" %-8d" +  '|' + " %d", q, (int)Math.pow(q, 2), (int)Math.pow(q, 3));
                System.out.println();
            }
            System.out.println("+--------|---------|-------+");
            System.out.print("Would you like to continue? [y/n]");
            userAns = scan.next();
            userCont = userAns.equalsIgnoreCase("y");
        } while (userCont);


        //Grade Ranges
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        //clear scanner
//        scan.nextLine();
//
//

        System.out.println("####### GRADE RANGE ###########");

        System.out.print("Enter a grade: ");
        int userGrade = scan.nextInt();
        boolean userContinue = true;
        String contAnswer;

        while (userContinue) {
            if (userGrade > 87){
                System.out.println('A');
            } else if (userGrade < 88 && userGrade > 79){
                System.out.println('B');
            } else if (userGrade < 80 && userGrade > 66){
                System.out.println('C');
            } else if (userGrade < 65 && userGrade > 59){
                System.out.println('D');
            } else {
                System.out.println('F');
            }
            System.out.printf("Would you like to continue? [y/n] ");
            contAnswer = scan.next();

            if (!contAnswer.equalsIgnoreCase("y")){
                userContinue = false;
            } else {
                System.out.print("Enter a grade: ");
                userGrade = scan.nextInt();
            }
        }

//BONUS QUESTION ########################## ##########################

//        1. Prompt the user to enter an integer between 1 and 7 and output the day of the week it maps to (Sunday is 1 and Saturday is 7)

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number 1-7:  ");
//        int userDay = scanner.nextInt();
//        String day;
//
//        switch (userDay){
//            case 1:
//                day = "Sunday";
//                System.out.println(day);
//                break;
//            case 2:
//                day = "Monday";
//                System.out.println(day);
//                break;
//            case 3:
//                day = "Tuesday";
//                System.out.println(day);
//                break;
//            case 4:
//                day = "Wednesday";
//                System.out.println(day);
//                break;
//            case 5:
//                day = "Thursday";
//                System.out.println(day);
//                break;
//            case 6:
//                day = "Friday";
//                System.out.println(day);
//                break;
//            case 7:
//                day = "Saturday";
//                System.out.println(day);
//                break;
//            default:
//                day = "Not a valid day";
//                System.out.println(day);
//                break;
//        }




//        2. Prompt the user for an integer. Output whether or not the number is prime.

//        System.out.print("Enter a prime number: ");
//        int userPrimeNum = scanner.nextInt();
//        boolean numPrime = true;
//
//            for (int j = 2; j < (userPrimeNum/2); j++){
//                if (userPrimeNum % j == 0) {
//                    System.out.println(userPrimeNum + " is NOT prime. Divisible by " + j);
//                    numPrime = false;
//                }
//            }
//
//            if (numPrime){
//                System.out.println("number is prime");
//            }
//
//






//        3. Prompt the user to enter an integer and output all the days of the week that
//        have no more letters than the integer given.


//        4. Prompt the user to enter their name. Output whether the name is
//                - short (less than 4 characters), medium (less than 9), long (more than 8)
//        - contains the letter 'y'
//                - is a palindrome


//        5. Print out all times from 1:00am to 12:00pm.
//                Example:
//        1:00am
//        1:01am
//        1:02am


    }
}
