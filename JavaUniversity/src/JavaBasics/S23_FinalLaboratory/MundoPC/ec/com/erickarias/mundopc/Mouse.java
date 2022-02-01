package JavaBasics.S23_FinalLaboratory.MundoPC.ec.com.erickarias.mundopc;

public class Mouse extends InputDevice{     // Mouse is Child Class of Input Device
    private final int mouseID;
    private static int mouseCounter;

    public Mouse(String inputType, String brand){
        super(inputType, brand);
        this.mouseID = ++Mouse.mouseCounter;    // Increment with each mouse object
    }

    @Override
    public String toString() {  // toString Method
        return "Mouse{" +
                "mouseID=" + mouseID + ", " + super.toString() +
                '}';
    }
}
