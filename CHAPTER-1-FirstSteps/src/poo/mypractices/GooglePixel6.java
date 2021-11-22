package poo.mypractices;

// Parent Class
public class GooglePixel6 {
    private int price;
    private final String COLOR;
    private double inchDisplay;
    private final double WEIGHT;
    private int refreshRate;
    private final String PROCESSOR;
    private int memoryRAM;
    private final String STORAGE;
    private int rearCameras;
    private int frontCamera;
    private final String AUTHENTICATION;
    private int battery;


    // CONSTRUCTOR METHOD
    public GooglePixel6(int pri, String col, String proc, String stor, String auth, double weig){
        price=pri;
        COLOR=col;
        PROCESSOR=proc;
        STORAGE=stor;
        AUTHENTICATION=auth;
        WEIGHT=weig;
        /*COLOR="Stormy Black, Cloudy White, Sorta Sunny";
        PROCESSOR ="Google Tensor Titan 2";
        STORAGE="128, 256 and 512";
        AUTHENTICATION ="Fingerprint Unlock with under display fingerprint sensor";
        WEIGHT=7.3;*/
    }

    public String getDataGooglePixel6(){    // GETTER Google Pixel 6 Data
        return "\nPrice: $" + price +
                "\nColor: " + COLOR +
                "\nProcessor: " + PROCESSOR +
                "\nStorage: " + STORAGE + " GB" +
                "\nAuthentication: " + AUTHENTICATION +
                "\nWeight: " + WEIGHT + " ounces";
    }

    public int getPrice(){      // GETTER for price
        return price;
    }

    public void setPrice(int price){        // SETTER for price
        this.price=price;
    }

}
