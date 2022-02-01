package JavaBasics.S23_FinalLaboratory.MundoPC.ec.com.erickarias.mundopc;

public class InputDevice {
    private String inputType;
    private String brand;

    public InputDevice(String inputType, String brand){ // Constructor Method
        this.inputType = inputType;
        this.brand = brand;
    }

    public String getInputType(){   // GETTER
        return  inputType;
    }

    public void setInputType(String inputType){ // SETTER
        this.inputType = inputType;
    }

    public String getBrand() {  // GETTER
        return brand;
    }

    public void setBrand(String brand) {    // SETTER
        this.brand = brand;
    }

    @Override
    public String toString() {  // toString Method
        return "InputDevice{" +
                "inputType='" + inputType + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
