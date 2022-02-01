package JavaBasics.S23_FinalLaboratory.MundoPC.ec.com.erickarias.mundopc;

public class Monitor {
    private final int monitorID;
    private String brand;
    private double size;
    private static int monitorCounter;

    private Monitor(){   // Private Empty Constructor
        this.monitorID = ++Monitor.monitorCounter;  // Increment with each monitor object
    }

    public Monitor(String brand, double size){  // Constructor with Parameters
        this(); // To call Private Empty Constructor
        this.brand = brand;
        this.size = size;
    }

    public int getMonitorID() {     // GETTER
        return monitorID;
    }

    public String getBrand() {      // GETTER
        return brand;
    }

    public void setBrand(String brand) {    // SETTER
        this.brand = brand;
    }

    public double getSize() {   // GETTER
        return size;
    }

    public void setSize(double size) {  // SETTER
        this.size = size;
    }

    @Override
    public String toString() {      // toString Method
        return "Monitor{" +
                "monitorID=" + monitorID +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
