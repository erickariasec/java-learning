package poo;

public class Van extends Car{       // Van Class INHERITS from Car Class

    private int load_capacity;
    private int passenger_capacity;

    public Van(int load_capacity, int passenger_capacity){
        super();    // Call CONSTRUCTOR METHOD from Parent Class (Car)
        this.load_capacity=load_capacity;
        this.passenger_capacity=passenger_capacity;
    }
}
