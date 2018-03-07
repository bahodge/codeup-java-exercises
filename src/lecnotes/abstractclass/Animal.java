package lecnotes.abstractclass;

public abstract class Animal {

    //State and behaviour shared to any class that extend from animal
    //Animal does not make sense to instantiate whereas a pug or wolf does
    public int age;
    public int weight;
    public String species;


    public abstract void eat();
}
