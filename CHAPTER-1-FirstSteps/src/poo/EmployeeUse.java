package poo;

import java.util.*;

public class EmployeeUse {
    public static void main(String[] args) {

        // THE LONGEST WAY
        /*Employee Employee1=new Employee("Stephan Hidalgo", 85000, 1990, 12, 17);
        Employee Employee2=new Employee("Erick Brooks", 95000, 1995, 6, 2);
        Employee Employee3=new Employee("Michell Heralds", 105000, 2002, 3, 15);

        Employee1.raiseSalary(5);
        Employee2.raiseSalary(5);
        Employee3.raiseSalary(5);

        System.out.println("Name: " + Employee1.returnName() + " Salary: " + Employee1.returnSalary() + " Discharge Date: " + Employee1.returnDischargeDateContract());
        System.out.println("Name: " + Employee2.returnName() + " Salary: " + Employee2.returnSalary() + " Discharge Date: " + Employee2.returnDischargeDateContract());
        System.out.println("Name: " + Employee3.returnName() + " Salary: " + Employee3.returnSalary() + " Discharge Date: " + Employee3.returnDischargeDateContract());*/

        Employee[] myEmployees=new Employee[3];

        myEmployees[0]=new Employee("Stephan Hidalgo", 85000, 1990, 12, 17);
        myEmployees[1]=new Employee("Erick Brooks", 95000, 1995, 6, 2);
        myEmployees[2]=new Employee("Michell Heralds", 105000, 2002, 3, 15);

        // BUCLE FOR (Normal)
        /*for(int i=0; i<3; i++){
            myEmployees[i].raiseSalary(5);
        }*/

        // BUCLE FOR EACH (Improved)
        for(Employee i: myEmployees){
            i.raiseSalary(5);
        }

        // BUCLE FOR (Normal)
        /*for(int i=0; i<3; i++){
            System.out.println("Name: " + myEmployees[i].returnName() + " Salary: " + myEmployees[i].returnSalary() +
                    " Discharge Date: " + myEmployees[i].returnDischargeDateContract());
        }*/

        // BUCLE FOR EACH (Improved)
        for(Employee i: myEmployees){
            System.out.println("Name: " + i.returnName() + " Salary: " + i.returnSalary() +
                    " Discharge Date: " + i.returnDischargeDateContract());
        }

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
