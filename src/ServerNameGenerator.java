public class ServerNameGenerator {

    private static final String[] nouns = {"Cat", "Dog", "Destroyer", "Cotton", "Money", "Dummy", "Candy", "Monster", "Cup", "Dirt"};
    private static final String[] adjectives = {"Dirty", "Milky", "Awkward", "Sandy", "Monstrous", "Metallic", "Derpy", "Spicy", "Smooth", "Immortal"};
    private static int randomNoun = (int) Math.floor(Math.random() * nouns.length);
    private static int randomAdj = (int) Math.floor(Math.random() * adjectives.length);

    public static void main(String[] args) {

        //random num gen
        System.out.println("Your server name is: ");
        System.out.println("+--------------------+");
        System.out.println(" " + adjectives[randomAdj] + "-" + nouns[randomNoun] + " ");
        System.out.println("+--------------------+");
    }
}
