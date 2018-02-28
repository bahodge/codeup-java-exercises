import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //While Loop
//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }


        //Do-While Loop
//        int j = 100;
//        do {
//            j -= 5;
//            System.out.println(j);
//        } while (j > -10);

//        double k = 2;
//        do {
//            System.out.println((int)k);
//            k = Math.pow(k, 2);
//
//        } while (k < 1000000);

        //For Loop
//        for (int l = 100; l >= -10; l-=5){
//            System.out.println(l);
//        }
//
//        for (double p = 2; p < 1000000; p = Math.pow(p, 2)){
//            System.out.println(p);
//        }



//        for (int i = 1; i <= 100; i++){
//            if (i % 15 == 0){
//                System.out.println("Fizzbuzz");
//                continue;
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//                continue;
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//                continue;
//            }
//            System.out.println(i);
//        }

        //Print a table
        Scanner scan = new Scanner(System.in);
        boolean userCont;
        String userAns;

        do {
            System.out.print("Enter your min value: ");
            int userLow = scan.nextInt();
            System.out.print("Enter your high value: ");
            int userHigh = scan.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = userLow; i <= userHigh; i++){
                System.out.printf("%-7d" + '|' +"%-9d" +  '|' + "%d", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
                System.out.println();
            }
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
//        System.out.print("Enter a grade: ");
//        int userGrade = scan.nextInt();
//        boolean userContinue = true;
//        String contAnswer;
//
//        while (userContinue) {
//            if (userGrade > 87){
//                System.out.println('A');
//            } else if (userGrade < 88 && userGrade > 79){
//                System.out.println('B');
//            } else if (userGrade < 80 && userGrade > 66){
//                System.out.println('C');
//            } else if (userGrade < 65 && userGrade > 59){
//                System.out.println('D');
//            } else {
//                System.out.println('F');
//            }
//            System.out.printf("Would you like to continue? [y/n] ");
//            contAnswer = scan.next();
//
//            if (!contAnswer.equalsIgnoreCase("y")){
//                userContinue = false;
//            } else {
//                System.out.print("Enter a grade: ");
//                userGrade = scan.nextInt();
//            }
//        }








    }
}
