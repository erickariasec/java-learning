package poo;

public class Car {

    private int wheels;
    private int length;
    private int width;       // To encapsulate data, we use "private"
    private int engine;
    private int weight_platform;
    private String color;
    private int weight_total;
    private boolean seats_leather, air_conditioner;



    public Car(){           // CONSTRUCTOR METHOD

        wheels=4;
        length=2000;
        width=300;
        engine=1600;
        weight_platform=500;

    }

    public String return_generalData(){                   // GETTER: Access Method
        return "The platform of my car has " + wheels + " wheels. " +
                "The car is " + length/1000 + " meters long with a width of "
                + width + "cm and this platform has a weight of " + weight_platform +
                " kg.";
    }

    public void set_color(String color_car){        // SETTER  /  SET PARAMETERS
        color=color_car;
    }

    public String return_color(){                   // GETTER
        return "The color of the car is " + color;
    }

    public void configure_seats(String seats_leather){      // SETTER
        if(seats_leather=="yes"){
            this.seats_leather=true; // this : To differentiate arguments from variables
        } else{
            this.seats_leather=false;
        }
    }

    public String return_seats(){                           // GETTER
        if(seats_leather==true){
            return "The car has seats leather";
        }else{
            return "The car has standard seats";
        }
    }

}
