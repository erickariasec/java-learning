package poo.latecnologiaavanza.setters_getters;

public class RegisterPersonUse {
    public static void main(String[] args) {

        RegisterPerson registerPerson = new RegisterPerson();

        registerPerson.setName("Erick");
        registerPerson.setAge(22);
        registerPerson.setHeight(1.73);

        System.out.println("The name is: " + registerPerson.getName());
        System.out.println("The age is: " + registerPerson.getAge());
        System.out.println("The height is: " + registerPerson.getHeight());
    }
}
