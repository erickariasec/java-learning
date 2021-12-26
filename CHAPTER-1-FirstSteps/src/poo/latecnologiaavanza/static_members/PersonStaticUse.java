package poo.latecnologiaavanza.static_members;


public class PersonStaticUse {

    // This GETTER is only for this Class
    public static int getAgeCalculation(int currentAge, int birthDate){
        return currentAge - birthDate;
    }

    /*public void setGreet2(String name){
        System.out.println("Hi, my name is " + name);
    }*/

    public static void main(String[] args) {

        // I could call all attributes and methods STATIC that are in the Class not Object
        PersonStatic.age = 24;  // This is PersonStatic Class Attribute
        PersonStatic.setGreet();  // This is PersonStatic Class Method
        PersonStatic.setSpeaker();  // This is PersonStatic Class Method


        PersonStatic personStatic = new PersonStatic(); // Creating Object
        personStatic.setGoodbye(); // Calling the only method NOT static

        int age = getAgeCalculation(2021, 1999); // Static GETTER for this Class Only
        System.out.println("\n\nThe real age is " + age);

    }
}
