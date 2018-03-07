package lecnotes.abstractclass;

import lecnotes.interfaceclass.Controllable;
import lecnotes.interfaceclass.Laptop;
import lecnotes.interfaceclass.Projector;

public class AbstractLecture {
    public static void main(String[] args) {

        System.out.println("------------Projector------------");
        Controllable projector = new Projector();
        powerForTwelveHours(projector);

        System.out.println("\n\n");

        System.out.println("------------Laptop------------");
        Controllable laptop = new Laptop();
        startLaptopWork(laptop);

    }

    private static void powerForTwelveHours (Controllable c) {
        c.powerOn();
        System.out.println("Waiting for 12 hours");
        c.powerOff();
    }
    private static void startLaptopWork(Controllable l){
        l.powerOn();
        System.out.println("Do web development work");
        System.out.println("web development work is complete");
        l.powerOff();
    }
}
