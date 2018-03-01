import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean askQuestion = true;
        String bobResponse;

        do {
            bobResponse = "";
            System.out.print("Hey Bob: ");
            String userPrompt = scan.nextLine();
            if (userPrompt.endsWith("?")){
                bobResponse += " Sure";
                System.out.println(bobResponse);
            } else if (userPrompt.trim().equals("")){
                bobResponse += " Fine. Be that way!";
                System.out.println(bobResponse);
            } else if (userPrompt.endsWith("!") || userPrompt.toUpperCase().equals(userPrompt)){
                bobResponse += " Woah, chill out!";
                System.out.println(bobResponse);
            }  else if (userPrompt.equalsIgnoreCase("bye")) {
                bobResponse += " Later Gator";
                System.out.println(bobResponse);
                askQuestion = false;
//                break;
            } else {
                bobResponse += " Whatever dude...";
                System.out.println(bobResponse);
            }
        } while (askQuestion);
    }
}


