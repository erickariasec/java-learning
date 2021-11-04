package poo.mypractices;
// THIS CLASS IS MY TEMPLATE
public class IPhone {
    // Camera 12mpx, White, Chip M14, Wireless Charge --> User choose capacity
    private int cameraResolution;
    private String color;
    private String processor;                           // ENCAPSULATION
    private boolean hasWirelessCharge;
    private int capacity;

    public IPhone (int capacity){ //64, 128, 256        // Constructor Method for iphone256v1
        cameraResolution=12;
        color="White";
        processor="Chip M14";
        hasWirelessCharge=true;
        this.capacity=capacity;
    }

    public IPhone(){                                    // Constructor Method for iphone256v2
        cameraResolution=12;
        color="White";
        processor="Chip M14";
        hasWirelessCharge=true;
        capacity=256;                                   // Capacity is established here
    }

    public String getDataIPhone(){                      // GETTER Data iPhone
        return "Your iPhone will have a camera resolution of " + cameraResolution + ", the color of this will be " + color +
                ", the processor is a " + processor + ". It contains Wireless Charge " + "and this capacity is " + capacity;
    }

    public String setColor (String color){              // SETTER AND GETTER Color - Ronald Method
        this.color=color;
        return "The new color of your iPhone is " + color;
    }

}
