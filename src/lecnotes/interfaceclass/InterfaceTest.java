package lecnotes.interfaceclass;

public class InterfaceTest {
    public static void main(String[] args) {
        Controllable projector = new Projector();
        Navigable myProj = new Projector();

        projector.powerOff();
        myProj.bringUpMenu();

    }
}
