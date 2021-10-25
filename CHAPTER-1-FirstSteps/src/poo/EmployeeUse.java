package poo;

import java.util.*;

public class EmployeeUse {
    public static void main(String[] args) {

    }
}

class Employee{

    public Employee(String nam, double sal, int year, int month, int day){  // This CONSTRUCTOR method receives PARAMETERS/ARGUMENTS

        name=nam;
        salary=sal;
        GregorianCalendar calendar=new GregorianCalendar(year, month-1, day);   // CLASS: GregorianCalendar - January=0
        dischargeDateContract=calendar.getTime();   // METHOD: getTime (Inherited Mehtod)
    }

    public String returnName(){     // GETTER
        return name;
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

    private String name;
    private double salary;
    private Date dischargeDateContract;
}
