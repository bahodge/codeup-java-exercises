package shapes;

public class Circle {
    private double radius;



    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //Getters
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getRadius(){
        return this.radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    //Setters
    public void setRadius (double radius) {
        this.radius = radius;
    }

}
