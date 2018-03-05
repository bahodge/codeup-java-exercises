package notes;

import java.util.Arrays;

public class ArrayNotes {
    public static void main(String[] args) {
//        double[] prices;
//        prices = new double[4];
//        prices[0] = 3.2;
//        System.out.println(prices[0]);
////        System.out.println(prices[10]); //ArrayIndexOutOfBoundsException
//
//
//
//        final int NUMBER_OF_BEATLES = 4; //Constant that doesn't need to change
//
//        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES]; //creates array to be numofbeatles long
//
//        theBeatles[0] = new BandMember("John", "Lennon"); //Uses constructor to add a new bandmember to array
//
//        System.out.println("The Beatles firstName: " + theBeatles[0].getFirstName()); //returns "John"
//        System.out.println("The Beatles Length: " + theBeatles.length); //the array is still holding 4 things.
//
//        int numberOfBugs = (int) Math.floor(Math.random() * 100); //Generates random number
//        Bug[] myCode = new Bug[numberOfBugs];
//        System.out.println("Num of bugs" + myCode.length); //Returns the length of the array

//        String[] beatles = {"John", "Ringo" , "Paul", "George"};
//        //Individual sout
//        System.out.println("beatles[0] " + beatles[0]);
//        System.out.println("beatles[1] " + beatles[1]);
//        System.out.println("beatles[2] " + beatles[2]);
//        System.out.println("beatles[3] " + beatles[3]);
//
//
//        //For loop
//        for (int i = 0; i < beatles.length; i++){
//            System.out.println(beatles[i]);
//        }
//
//        //Enhanced For Loop (for Each)
//        for (String element : beatles){
//            System.out.println(element);
//        }


//        //Initalizes array
        int[] someNumbers = new int[5];
//        // Loop sets values of index
//        for (int i = 1; i <= someNumbers.length; i++){
//            someNumbers[i-1] = i;
//        }
//        //Prints values
//        for (int ele : someNumbers){
//            System.out.println(ele);
//        }
//
//        String[] someStrings = new String[4];
//        Arrays.fill(someStrings, "Badger");
//        String arrayAsAString = Arrays.toString(someStrings);
//        System.out.println(arrayAsAString);
//
//
//        String[] words = {"Mushroom" , "Mushroom"};
//        System.out.println(words.equals(someStrings)); //Returns false;
//
//
//        String[] copyOfBadgers = Arrays.copyOf(someStrings, 10);
//        String copy = Arrays.toString(copyOfBadgers);
//        System.out.println(copy);
//
//        String[] meme = {"Badger", "Mushroom", "Badger", "Snake"};
//        Arrays.sort(meme);
//
//        System.out.println(Arrays.binarySearch(meme, "Mushroom"));

        int[][] matrix = {
                {1 , 2, 3},
                {4 , 5, 6},
                {7 , 8, 9}
        };

        System.out.println(matrix[0][2]);//Returns 3

        for (int[] row : matrix){
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int n : row){
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");


    }
}
