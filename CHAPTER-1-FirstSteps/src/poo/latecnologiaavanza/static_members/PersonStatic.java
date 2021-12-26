package poo.latecnologiaavanza.static_members;

public class PersonStatic {

    public static final String NAME = "Nat";  // Constant (final) are in Uppercase
    public static int age = 22;
    public static final int ID = 1223764532;
    public static double height = 1.60;

    public static void setGreet(){  // It is part of the Class, not the Object
        System.out.println("Hi, my name is " + NAME);
        System.out.println("I am " + age + " years old!");
        System.out.println("My ID is " + ID);
        System.out.println("My height is " + height + " meters tall");
    }

    public static void setSpeaker(){  // It is part of the Class, not the Object
        System.out.println("I am talking");
    }

    public void setGoodbye(){   // It is part of the Object, not the Class
        System.out.println("Bye, see you later!");
    }

}
