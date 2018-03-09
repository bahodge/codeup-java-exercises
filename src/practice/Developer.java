package practice;

import java.util.ArrayList;

public class Developer extends Employee implements Trainable{

    public Developer(String name, String department, double baseSalary) {
        super(name, department, baseSalary);
    }

    public String work(){
        return "Coding....";
    }


    public void train(int hours) {
        baseSalary += hours / baseSalary;
    }

}
