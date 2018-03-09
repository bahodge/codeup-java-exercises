package practice;

import java.util.ArrayList;

public class CompanyApp {


    public static void main(String[] args) {

        //Instantiates new "JOB" as an 'Employee' Type
        Employee bobo = new Accountant("Bobo", "Accounting", 23);
        Employee steveo = new Manager("Steveo", "Management", 45);
        Employee robbie = new Developer("Robbie", "Software", 30);

//        Instantiates new "JOB" as the "JOB" type
        Accountant john = new Accountant("John", "Accounting", 27);
        Manager sean = new Manager("Sean", "Management", 45);
        Developer bob = new Developer("Bob", "Software", 33);

        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(bobo);
        allEmployees.add(steveo);
        allEmployees.add(robbie);
        allEmployees.add(john);
        allEmployees.add(sean);
        allEmployees.add(bob);

        System.out.println("All employees: ");
        for (Employee emp : allEmployees){
            System.out.print(" | " + emp.getName() + " | ");
        }


        ArrayList<Employee> allTrainable = new ArrayList<>();
        for (Employee employee : allEmployees){
            if (employee instanceof Trainable){
                allTrainable.add(employee);
            }
        }

        System.out.println("\n\nAll trainable employees: ");
        for (Employee emp : allTrainable){
            System.out.print(" | " + emp.getName() + " | ");
        }




    }
}
