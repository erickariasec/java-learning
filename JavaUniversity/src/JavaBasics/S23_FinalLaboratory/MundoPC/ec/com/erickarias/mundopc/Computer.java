package JavaBasics.S23_FinalLaboratory.MundoPC.ec.com.erickarias.mundopc;

public class Computer {
    private final int computerID;
    private String name;
    private Monitor monitor;        // Aggregation Relationship
    private Keyboard keyboard;      // Aggregation Relationship
    private Mouse mouse;            // Aggregation Relationship
    private static int computerCounter;

    private Computer(){     // Private Empty Constructor
        this.computerID = ++Computer.computerCounter;     // Increment with each computer object
    }

    // Constructor to create Complete Computer Objects
    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse){
        this();  // To call Private Empty Constructor
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getComputerID() {    // GETTER
        return computerID;
    }

    public String getName() {   // GETTER
        return name;
    }

    public void setName(String name) {      // SETTER
        this.name = name;
    }

    public Monitor getMonitor() {   // GETTER
        return monitor;
    }

    public void setMonitor(Monitor monitor) {   // SETTER
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {     // GETTER
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {    // SETTER
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {   // GETTER
        return mouse;
    }

    public void setMouse(Mouse mouse) {     // SETTER
        this.mouse = mouse;
    }

    @Override
    public String toString() {  // Method toString
        /* Each variable will call their own toString Method, so when we send to print a Computer Object,
           each Object will print their own information */
        return "Computer{" +
                "computerID=" + computerID +
                ", name='" + name + '\'' +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                '}';
    }
}
