package lecnotes.interfaceclass;

public class Laptop implements Controllable {
    public void powerOn() {
        System.out.println("Power button clicked");
        System.out.println("Spinning up HDD and turning on screen");
        System.out.println("Returning - job complete");
    }

    public void powerOff() {
        System.out.println("Power button clicked");
        System.out.println("Shutting down HDD and turning off screen");
        System.out.println("Returning - job complete");
    }
}
