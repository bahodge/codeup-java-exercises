public class ServerNameGenerator {




    public static void main(String[] args) {

        String[] nouns = {"Cat", "Dog", "Destroyer", "Cotton", "Money", "Dummy", "Candy", "Monster", "Cup", "Dirt"};

        String[] adjectives = {"Dirty", "Milky", "Awkward", "Sandy", "Monstrous", "Metallic", "Derpy", "Spicy", "Smooth", "Immortal"};

        //random num gen
        int randomNoun = (int) Math.floor(Math.random() * nouns.length);
        int randomAdj = (int) Math.floor(Math.random() * adjectives.length);

        System.out.println("Your server name is: ");
        System.out.println("+--------------------+");
        System.out.println(" " + adjectives[randomAdj] + "-" + nouns[randomNoun] + " ");
        System.out.println("+--------------------+");


    }

}
