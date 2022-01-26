package JavaBasics.S18_PackagesJava.test;

//import JavaBasics.S18_PackagesJava.ec.com.erickarias.*;
import JavaBasics.S18_PackagesJava.ec.com.erickarias.Utilities;
//import static JavaBasics.S18_PackagesJava.ec.com.erickarias.Utilities.prints;     // Static Package

public class UtilitiesUse {
    public static void main(String[] args) {
        Utilities.prints("Hello");
        //prints("Bye");        // It works when imports: Static Package
    }
}
