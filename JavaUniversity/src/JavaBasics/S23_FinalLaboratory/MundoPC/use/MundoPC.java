package JavaBasics.S23_FinalLaboratory.MundoPC.use;

import JavaBasics.S23_FinalLaboratory.MundoPC.ec.com.erickarias.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        // COMPUTER HP
        Monitor monitorHP = new Monitor("HP", 14);  // Creating Monitor Object
        Keyboard keyboardHP = new Keyboard("bluetooth", "HP");  // Creating Keyboard Object
        Mouse mouseHP = new Mouse("bluetooth", "HP");   // Creating Mouse Object
        // Creating Computer Object
        Computer computerHP = new Computer("HP Computer", monitorHP, keyboardHP, mouseHP); // Aggregation Relationship


        // COMPUTER ASUS
        Monitor monitorASUS = new Monitor("ASUS", 34);  // Creating Monitor Object
        Keyboard keyboardASUS = new Keyboard("bluetooth", "ASUS");  // Creating Keyboard Object
        Mouse mouseASUS = new Mouse("bluetooth", "ASUS");   // Creating Mouse Object
        // Creating Computer Object
        Computer computerASUS = new Computer("ASUS Computer", monitorASUS, keyboardASUS, mouseASUS); // Aggregation Relationship


        Order order1 = new Order();     // Creating Object for Order 1
        order1.addComputer(computerHP);     // Adding HP Computer to Order 1
        order1.addComputer(computerASUS);   // Adding ASUS Computer to Order 1

        order1.showOrder();     // Show all Order Information


        System.out.println("\n\n");


        Order order2 = new Order();     // Creating Object for Order 2
        order2.addComputer(computerASUS);
        order2.addComputer(computerASUS);
        order2.addComputer(computerASUS);       // Adding 5 Computers to the Order
        order2.addComputer(computerHP);
        order2.addComputer(computerHP);

        order2.showOrder();     // Show All Order Information
    }
}
