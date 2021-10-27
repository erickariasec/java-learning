package poo;

import javax.swing.*;

public class VehicleUse {

    public static void main(String[] args) {

        Car Renault=new Car();      // INSTANTIATE A CLASS. CLASS EXEMPLARY

        Renault.set_color(JOptionPane.showInputDialog("Enter color"));        // Call SETTER / PARAMETER PASSING

        System.out.println(Renault.return_generalData());
        System.out.println(Renault.return_color());

        Renault.configure_seats(JOptionPane.showInputDialog("Do you want leather seats? (yes/no)"));
        System.out.println(Renault.return_seats());

        Renault.configure_airConditioning(JOptionPane.showInputDialog("Do you want air conditioning? (yes/no)"));
        System.out.println(Renault.return_airConditioning());

        System.out.println(Renault.return_weightCar() + " kg");

        System.out.println("The price of the car is $" + Renault.return_priceCar());

    }
}
