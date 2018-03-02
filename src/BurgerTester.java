public class BurgerTester {

    public static void main(String[] args) {

//        BurgerTools bt = new BurgerTools();
        BurgerTools.mostPopularTopping = "Cheese";
        BurgerTools.averageDaysBeforeExpiration = 7;
        BurgerTools.temperatureWhenCooked = 170;


        System.out.println("The best topping is: " + BurgerTools.mostPopularTopping);
        System.out.println("Days before expiration: " + BurgerTools.averageDaysBeforeExpiration);
        System.out.println("Temperature when cooked: " + BurgerTools.temperatureWhenCooked);

        System.out.printf("The average cook makes " + "$%.2f" + " and only has a " + BurgerTools.averageEducationLevel, BurgerTools.averageFryCookWage);

        System.out.println(" Now lets start got grill!");



        BurgerTools.grill();

    }






}
