public class RestaurantTest {
    public static void main(String[] args) {


        //Object One
        RestaurantDish rd = new RestaurantDish();
        rd.setCostInCents(2500);
        rd.setNameOfDish("Grule");
        rd.setWouldRecommend(true);

        System.out.println("Cost in cents: " + rd.getCostInCents() + "  Name of Dish: " + rd.getNameOfDish() + "  Would Reccomend: " + rd.isWouldRecommend());

        rd.eat();

        //Object Two
        RestaurantDish rd2 = new RestaurantDish(230, "Crumbs", false);
        System.out.println("Cost in cents: " + rd2.getCostInCents() + "  Name of Dish: " + rd2.getNameOfDish() + "  Would Reccomend: " + rd2.isWouldRecommend());

        rd2.eat();

        //Object Three

        RestaurantDish rd3 = new RestaurantDish(25000);
        System.out.println("Cost in cents: " + rd3.getCostInCents() + "  Name of Dish: " + rd3.getNameOfDish() + "  Would Reccomend: " + rd3.isWouldRecommend());
        rd3.eat();




    }
}
