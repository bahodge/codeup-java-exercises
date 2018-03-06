package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {

    private static Movie[] movieFinder = MoviesArray.findAll();
    private static boolean userContinue;


    public static void main(String[] args) {
        Input input = new Input(); //Only need 1
        do {
            userContinue = true;
            promptUser();
            parseUserInput(input.getInt("Please Select an option: "), movieFinder);
        } while (userContinue);
    }
//    ################### Methods #################

    private static void promptUser(){
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - add your own movie");
        System.out.println("8 - Search for a movie by title");
        System.out.println("\n");
    }

    private static void printTableHead() {
        System.out.println("+------------------------------------------------------+");
        System.out.printf("| " + "%-40s" + " | " + "%-10s" + "|", "Title", "Category");
        System.out.println();
        System.out.println("+------------------------------------------------------+");
    }

    private static void constructMovie(Movie movie){
        System.out.printf("| " + "%-40s" + " | " + "%-10s" + "|", movie.getName(), movie.getCategory());
        System.out.println();
        System.out.println("+------------------------------------------------------+");
    }

    private static void addMovie(Movie[] movieArray){
        Input input = new Input();
        //new movie create
        String[] categories = {"animated", "drama", "horror", "scifi"};
        String newTitle = input.getString("New Movie Title: ");
        String newCategory;
        boolean matchesExisting = false;
        do {
            newCategory = input.getString("New Movie Category: ");
            for(String category : categories){
                if (category.equalsIgnoreCase(newCategory)){
                    matchesExisting = true;
                    break;
                } else {
                    matchesExisting = false;
                }
            }
        } while (!matchesExisting);
        Movie addedMovie = new Movie(newTitle, newCategory);
        System.out.println(addedMovie.getName() + addedMovie.getCategory());
        movieArray = Arrays.copyOf(movieArray, movieArray.length + 1);
        movieArray[movieArray.length - 1]= addedMovie;
        movieFinder = movieArray;
    }

    private static void searchMovie(){
        Input input = new Input();
        String searchString = input.getString("Enter a title: ");
        int count = 0;
        Movie editableMovie = null;
        boolean editMovieQuestion;
        printTableHead();
        for (Movie ele : movieFinder){
            if (ele.getName().toLowerCase().contains(searchString.toLowerCase())){
                count++;
                constructMovie(ele);
                editableMovie = ele;
            }
        }

        if (count == 1){
            do{
                editMovieQuestion = input.getString("Would you like to edit this?[y/n]: ").equalsIgnoreCase("y");
                if (editMovieQuestion){
                    editMovieName(editableMovie);
                }
            } while (editMovieQuestion);
        }
        if (count == 0){
            System.out.println("No results");
        }
    }
//    WIP
    private static void editMovieName(Movie movieObj) {
        Input input = new Input();
        movieObj.setName(input.getString("Enter new title: "));
        if (input.getString("Change category?[y/n]:  ").equalsIgnoreCase("y")){
            movieObj.setCategory(input.getString("Enter new category: "));
        }
    }

    private static void parseUserInput(int userInput, Movie[] refArray) {
        switch (userInput){
            case 1:
                //find all
                printTableHead();
                for (Movie m : refArray){
                    constructMovie(m);
                }
                break;
            case 2:
                //Animated
                printTableHead();
                for (Movie m : refArray){
                    if (m.getCategory().equalsIgnoreCase("animated")){
                        constructMovie(m);
                    }
                }
                break;
            case 3:
                //Drama
                printTableHead();
                for (Movie m : refArray){
                    if (m.getCategory().equalsIgnoreCase("drama")){
                        constructMovie(m);
                    }
                }
                break;
            case 4:
                //Horror
                printTableHead();
                for (Movie m : refArray){
                    if (m.getCategory().equalsIgnoreCase("horror")){
                        constructMovie(m);
                    }
                }
                break;
            case 5:
                //Scifi
                printTableHead();
                for (Movie m : refArray){
                    if (m.getCategory().equalsIgnoreCase("scifi")){
                        constructMovie(m);
                    }
                }
                break;
            case 6:
                //Musical
                printTableHead();
                for (Movie m : refArray){
                    if (m.getCategory().equalsIgnoreCase("musical")){
                        constructMovie(m);
                    }
                }
                break;
            case 7:
                addMovie(refArray);
                break;
            case 8:
                searchMovie();
                break;
            default:
                //Exit;
                System.out.println("Good Bye!");
                userContinue = false;
                break;
        }
    }
}
