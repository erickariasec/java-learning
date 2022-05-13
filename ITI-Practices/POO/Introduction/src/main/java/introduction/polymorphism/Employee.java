package introduction.polymorphism;

public class Employee {
    protected String name;
    protected double salary;
    
    protected Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getDetails(){
        return "Name: " + name + ", salary: " + salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
