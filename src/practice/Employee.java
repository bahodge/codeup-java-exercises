package practice;

public abstract class Employee {
    protected String name;
    protected String department;
    protected double baseSalary;

    public Employee () {};

    public Employee(String name, String department, double baseSalary) {
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }


    public abstract String work();
}
