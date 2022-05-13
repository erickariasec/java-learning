package introduction.polymorphism;

public class PolymorphismUse {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee("Juan", 1000);
        printDetails(emp);
        
        Boss boss = new Boss("Karla", 2000, "Finance");
        printDetails(boss);
    }
    
    public static void printDetails(Employee emp) {
        System.out.println(emp.getDetails());
    }
}
