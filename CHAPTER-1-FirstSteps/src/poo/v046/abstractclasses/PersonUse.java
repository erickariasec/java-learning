package poo.v046.abstractclasses;

import java.util.Date;
import java.util.GregorianCalendar;

public class PersonUse {
    public static void main(String[] args) {

        Person[] thePeople=new Person[2];

        thePeople[0]=new Employee("Luis Cook", 50000, 2009, 02, 25);
        thePeople[1]=new Student("Ana Lee", "Biology");

        for(Person person : thePeople){
            System.out.println(person.getName() + ", " + person.getDescription()); // Each object will print its own getDescription Method, thanks to Abstract Class
        }

    }
}
