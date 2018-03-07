package lecnotes.interfaceclass;

public class Projector implements Controllable, Navigable {

    //Controllable Interface
    public void powerOn() {
        System.out.println("Picking up remote signal");
        System.out.println("Testing if off, else turning on");
        System.out.println("Turning on the projector");
    }

    public void powerOff() {
        System.out.println("Picking up remote signal");
        System.out.println("Testing if on, else turning off");
        System.out.println("Turning off the projector");
    }

    //Open Menu
    public void bringUpMenu() {
        System.out.println("Menu button pressed");
        System.out.println("Opening Menu");
        System.out.println("Returning - Job Complete");
    }

    //Scroll Up
    public void scrollUpMenu() {
        System.out.println("Scroll up button pressed");
        System.out.println("Scrolling up");
        System.out.println("Returning - job complete");
    }

    //Scroll Down
    public void scrollDownMenu() {
        System.out.println("Scroll down button pressed");
        System.out.println("Scrolling down");
        System.out.println("Returning - job complete");
    }
}
