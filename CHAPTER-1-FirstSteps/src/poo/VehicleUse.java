package poo;

import javax.swing.*;

public class VehicleUse {

    public static void main(String[] args) {

        Car MyCar1=new Car();       // Creation of the first Instance or Method belongs to Car Class

        MyCar1.set_color("Red");


        Van MyVan1=new Van(580, 7);     // Creation of Van Object

        MyVan1.set_color("Blue");
        MyVan1.configure_seats("yes");
        MyVan1.configure_airConditioning("yes");

        System.out.println(MyCar1.return_generalData() + " " + MyCar1.return_color());
        System.out.println(MyVan1.return_generalData() + MyVan1.returnVanData());


        // OLD VERSION
        /*Car Renault=new Car();      // INSTANTIATE A CLASS. CLASS EXEMPLARY

        Renault.set_color(JOptionPane.showInputDialog("Enter color"));        // Call SETTER / PARAMETER PASSING

        System.out.println(Renault.return_generalData());
        System.out.println(Renault.return_color());

        Renault.configure_seats(JOptionPane.showInputDialog("Do you want leather seats? (yes/no)"));
        System.out.println(Renault.return_seats());

        Renault.configure_airConditioning(JOptionPane.showInputDialog("Do you want air conditioning? (yes/no)"));
        System.out.println(Renault.return_airConditioning());

        System.out.println(Renault.return_weightCar() + " kg");

        System.out.println("The price of the car is $" + Renault.return_priceCar());*/

    }
}
