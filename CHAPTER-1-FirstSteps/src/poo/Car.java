package poo;

public class Car {

    private int wheels;
    private int length;
    private int width;       // To encapsulate data, we use "private"
    private int engine;
    private int weight_platform;
    String color;
    int weight_total;
    boolean seats_leather, air_conditioner;



    public Car(){           // CONSTRUCTOR METHOD

        wheels=4;
        length=2000;
        width=300;
        engine=1600;
        weight_platform=500;

    }

    public String return_large(){                   // GETTER: Access Method
        return "The length of the car is " + length;
    }

    public void set_color(String color_car){        // SETTER  /  SET PARAMETERS
        color=color_car;
    }

    public String return_color(){                   // GETTER
        return "The color of the car is " + color;
    }

}
