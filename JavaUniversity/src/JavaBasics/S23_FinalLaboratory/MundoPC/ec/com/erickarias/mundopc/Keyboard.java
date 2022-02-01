package JavaBasics.S23_FinalLaboratory.MundoPC.ec.com.erickarias.mundopc;

public class Keyboard extends InputDevice{      // Keyboard is Child Class of InputDevice
    private final int keyboardID;
    private static int keyboardCounter;

    public Keyboard(String inputType, String brand){    // Constructor
        super(inputType, brand);
        this.keyboardID = ++Keyboard.keyboardCounter;   // Increment with each keyboard object
    }

    @Override
    public String toString() {  // toString Method
        return "Keyboard{" +
                "keyboardID=" + keyboardID + ", " + super.toString() +
                '}';
    }
}
