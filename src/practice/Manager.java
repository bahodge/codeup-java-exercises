package practice;

import java.util.ArrayList;

public class Manager extends Employee implements Trainer{



    public Manager(String name, String department, double baseSalary) {
        super(name, department, baseSalary);
    }

    public String work(){
        return "Managing Employees...";
    }

    public void trainOthers(ArrayList<Employee> employees) {
        for (Employee emp : employees){
            System.out.println(emp.getName());
        }

    }
}
