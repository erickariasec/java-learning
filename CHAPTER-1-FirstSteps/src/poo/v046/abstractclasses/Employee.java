package poo.v046.abstractclasses;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person{         // PARENT CLASS

    private double salary;
    private final Date dischargeDateContract;       // CONSTANT
    private final int ID;
    private static int NextID=1;        // STATIC VARIABLE

    public Employee(String name, double salary, int year, int month, int day){  // This CONSTRUCTOR method receives PARAMETERS/ARGUMENTS

        super(name); // Call Constructor from Parent Class (Person)

        this.salary=salary;
        GregorianCalendar calendar=new GregorianCalendar(year, month-1, day);   // CLASS: GregorianCalendar - January=0
        dischargeDateContract=calendar.getTime();   // METHOD: getTime (Inherited Method)
        ID=NextID;
        NextID++;
    }

    public String getDescription(){ // Overriding getDescription Method of Parent Class (Person)
        return "This employee has an ID=" + ID + " with salary=" + salary;
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
}
