package poo;

public class Car {

    private int wheels;
    private int length;
    private int width;       // To encapsulate data, we use "private"
    private int engine;
    private int weight_platform;
    private String color;
    private int weight_total;
    private boolean seats_leather, airConditioning;



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
        if(seats_leather.equals("yes")){
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

    public void configure_airConditioning(String airConditioning){  // SETTER
        if(airConditioning.equals("yes")){
            this.airConditioning=true;
        }else{
            this.airConditioning=false;
        }
    }

    public String return_airConditioning(){     // GETTER
        if(airConditioning==true){
            return "The car incorporates air conditioning";
        }else{
            return "The car incorporates normal air";
        }
    }

    public String return_weightCar() {   // SETTER + GETTER    (POOR PROGRAMMING PRACTICE)
        int weight_carBody = 500;
        weight_total = weight_platform + weight_carBody;
        if (seats_leather == true) {
            weight_total = weight_total + 50;
        }
        if (airConditioning == true) {
            weight_total = weight_total + 20;
        }
        return "The weight of the car is " + weight_total;
    }

    public int return_priceCar(){       // GETTER
        int priceFinal=10000;
        if(seats_leather==true){
            priceFinal+=2000;
        }
        if(airConditioning==true){
            priceFinal+=1500;
        }
        return priceFinal;
    }

}
