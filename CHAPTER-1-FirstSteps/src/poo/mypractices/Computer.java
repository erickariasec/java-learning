package poo.mypractices;

public class Computer {

    private int keyboard;
    private int monitor;
    private int cpu;
    private int mouse;                      // ENCAPSULATION
    private int computerFinalPrice;
    private boolean headphones;
    private boolean webcam;
    private boolean printer;

    public Computer(){                  // CONSTRUCTOR METHOD
        keyboard=2;
        monitor=1;
        cpu=1;
        mouse=2;
        computerFinalPrice=1200;
    }



    public void setUpHeadphones(String headphones){              // SETTER for Headphones
        if (headphones.equalsIgnoreCase("yes")) {
            this.headphones = true;
        }
    }

    public String returnHeadphones(){                           // GETTER for Headphones
        if (headphones){
            return "Your computer includes headphones";
        }else{
            return "Headphones are not included";
        }
    }



    public void setUpWebCam(String webcam){                     // SETTER for Webcam
        if (webcam.equalsIgnoreCase("yes")){
            this.webcam=true;
        }
    }

    public String returnWebcam(){                               // GETTER for Webcam
        if (webcam){
            return "Your computer includes webcam";
        }else{
            return "Webcam is not included";
        }
    }



    public void setUpPrinter(String printer){                    // SETTER for Printer
        if (printer.equalsIgnoreCase("yes")){
            this.printer=true;
        }
    }

    public String returnPrinter(){                               // GETTER for Printer
        if (printer){
            return "Your computer includes printer";
        }else{
            return "Printer is not included";
        }
    }



    public int returnComputerFinalPrice(){                      // GETTER for Computer Final Price
        if (headphones){
            computerFinalPrice+=35;
        }
        if (webcam){
            computerFinalPrice+=140;
        }
        if (printer){
            computerFinalPrice+=350;
        }
        return computerFinalPrice;
    }
}
