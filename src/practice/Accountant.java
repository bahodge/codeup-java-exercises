package practice;

public class Accountant extends Employee implements Trainable{

    public Accountant(String name, String department, double baseSalary) {
        super(name, department, baseSalary);
    }

    public String work() {
        return "crunching numbers...";
    }



    public void train(int hours) {
        baseSalary += (hours*.5) / baseSalary;
    }

}