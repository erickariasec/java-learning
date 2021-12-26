package poo.latecnologiaavanza.static_members;

import poo.latecnologiaavanza.constant.PersonConstant;

public class PersonStaticUse {
    public static void main(String[] args) {

        // I could call all attributes and methods STATIC that are in the Class not Object
        PersonStatic.age = 24;  // This is PersonStatic Class Attribute
        PersonStatic.setGreet();  // This is PersonStatic Class Method
        PersonStatic.setSpeaker();  // This is PersonStatic Class Method

        PersonStatic personStatic = new PersonStatic(); // Creating Object
        personStatic.setGoodbye(); // Calling the only method NOT static

    }

}
