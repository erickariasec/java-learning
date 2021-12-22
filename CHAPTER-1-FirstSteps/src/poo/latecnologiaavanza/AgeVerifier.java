package poo.latecnologiaavanza;

public class AgeVerifier {

    public void verifyLegalAge(int age, String name, double height){
        if(age >= 18){
            System.out.println("The citizen " + name + " is of legal age" +
                    " and is " + height + " meters tall");
        }
        else{
            System.out.println("The citizen " + name + " is NOT of legal age" +
                    " and is " + height + " meters tall");
        }
    }

}
