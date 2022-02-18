package poo.v044.objectcasting_finalclassesandmethods;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeUse {
    public static void main(String[] args) {

        Headship bossRRHH=new Headship("Juan Diaz", 55000, 2006, 9, 25);
        bossRRHH.setIncentive(2570);    // SET INCENTIVE

        Employee[] myEmployees=new Employee[7];

        myEmployees[0]=new Employee("Stephan Hidalgo", 85000, 1990, 12, 17);
        myEmployees[1]=new Employee("Erick Brooks", 95000, 1995, 6, 2);
        myEmployees[2]=new Employee("Michell Heralds", 105000, 2002, 3, 15);
        myEmployees[3]=new Employee("Susan Vasquez");   // Rest of parameters are set down
        myEmployees[4]=new Employee("Emily Rose");
        myEmployees[5]=bossRRHH;    // POLYMORPHISM in action!  -  Substitution Principle
        // We can use an object from subclass when the program expects an object of superclass.
        myEmployees[6]=new Headship("Marla Villarroel", 95000, 1999, 9, 12);
        // This is exactly the same, is another way to use POLYMORPHISM

        // BUCLE FOR EACH (Improved)
        for(Employee i: myEmployees){
            i.raiseSalary(5);
        }

        // BUCLE FOR EACH (Improved)
        for(Employee i: myEmployees){
            System.out.println("Name: " + i.returnName() + " Salary: " + i.returnSalary() +
                    " Discharge Date: " + i.returnDischargeDateContract());
        }

    }
}

class Employee{         // PARENT CLASS

    public Employee(String nam, double sal, int year, int month, int day){  // This CONSTRUCTOR method receives PARAMETERS/ARGUMENTS

        NAME =nam;
        salary=sal;
        GregorianCalendar calendar=new GregorianCalendar(year, month-1, day);   // CLASS: GregorianCalendar - January=0
        dischargeDateContract=calendar.getTime();   // METHOD: getTime (Inherited Method)
        ID=NextID;
        NextID++;
    }

    public Employee(String nam){        // CONSTRUCTOR OVERLOAD
        this(nam, 30000, 2000, 1, 1);
    }

    public String returnName(){     // GETTER
        return NAME + " ID: " + ID;
    }

    public double returnSalary(){   // GETTER
        return salary;
    }

    public Date returnDischargeDateContract(){  // GETTER
        return dischargeDateContract;
    }

    public void raiseSalary(double percentage){     // SETTER
        double salaryIncrease=salary*percentage/100;
        salary+=salaryIncrease;
    }

    private final String NAME;      // CONSTANT
    private double salary;
    private final Date dischargeDateContract;       // CONSTANT
    private final int ID;
    private static int NextID=1;        // STATIC VARIABLE
}


class Headship extends Employee{            // CHILD CLASS - INHERITS FROM EMPLOYEE CLASS

    public Headship(String nom, double sal, int year, int month, int day){

        // Passing Constructor Method with all Parameters using super
        super(nom, sal, year, month, day);  // Call Main Constructor Method from Employee

    }

    public void setIncentive(double b){
        incentive=b;
    }

    public double returnSalary(){  // OVERWRITING Employee Method, only for this Class
        double salaryBoss=super.returnSalary();  // Calling returnSalary form Parent Class
        return salaryBoss + incentive;
    }

    private double incentive;

}
