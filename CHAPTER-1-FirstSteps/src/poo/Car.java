package poo;

public class Car {

    private int wheels;
    private int length;
    private int width;       // To encapsulate data, we use "private"
    private int engine;
    private int weight;



    public Car(){           // CONSTRUCTOR METHOD

        wheels=4;
        length=2000;
        width=300;
        engine=1600;
        weight=500;

    }

    public String return_large(){                   // Getter: Access Method
        return "The length of the car is " + length;
    }

}
