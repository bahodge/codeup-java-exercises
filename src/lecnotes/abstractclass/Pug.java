package lecnotes.abstractclass;

import lecnotes.abstractclass.Dog;

public class Pug extends Dog {


    //Pug is more tangible and therefore makes sense to be instantiated.

    //Eat class was declared abstract on Animal therefore must be declared in inherited classes.
    //This is the FIRST non abstract class
    public void eat() {
        System.out.println("Eating kibbles...");
    }

}
