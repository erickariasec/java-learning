package introduction.polymorphism;

public class Boss extends Employee {
    
    private String department;
    
    public Boss(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }
    
    public String getDetails(){
        return super.getDetails() + ", department: " + department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
