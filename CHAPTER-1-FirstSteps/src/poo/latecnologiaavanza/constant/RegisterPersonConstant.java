package poo.latecnologiaavanza.constant;

public class RegisterPersonConstant {
    public static void main(String[] args) {

        PersonConstant personConstant = new PersonConstant();
        // personConstant.name = "Alexis";  This is not possible because is final
        personConstant.setGreet();

    }
}
