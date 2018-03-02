public class RestaurantDish {


    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void eat(){
        System.out.println("Om Nom Nom!");
    }

    public RestaurantDish () {}

    public RestaurantDish(int costInCents) {
        this.costInCents = costInCents;
        this.nameOfDish = "Unknown";
        this.wouldRecommend = false;
    }


    public RestaurantDish(int costInCents, String nameOfDish) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = false;
    }

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    //Getters

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    //Setters

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}
