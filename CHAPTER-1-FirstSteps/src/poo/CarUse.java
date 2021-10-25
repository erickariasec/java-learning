package poo;

public class CarUse {

    public static void main(String[] args) {

        Car Renault=new Car();      // INSTANTIATE A CLASS. CLASS EXEMPLARY

        Renault.set_color("blue");        // Call SETTER / PARAMETER PASSING

        System.out.println(Renault.return_generalData());
        System.out.println(Renault.return_color());

        Renault.configure_seats("no");
        System.out.println(Renault.return_seats());

        Renault.configure_airConditioning("yes");
        System.out.println(Renault.return_airConditioning());

        System.out.println(Renault.return_weightCar() + " kg");

        System.out.println("The price of the car is $" + Renault.return_priceCar());

    }
}
