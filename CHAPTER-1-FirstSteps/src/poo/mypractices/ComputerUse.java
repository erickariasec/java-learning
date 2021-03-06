package poo.mypractices;

import javax.swing.*;

public class ComputerUse {

    public static void main(String[] args) {

        Computer BasicComputer=new Computer();          // INSTANTIATE A CLASS

        System.out.print("\n\t\t\t\t\tCOMPUTHOR E-COMMERCE\n");
        System.out.print("\t\t\t\t\t--------------------\n\n");

        System.out.print("\t\t\t\t\t   SPECIAL OFFER\n\n");
        System.out.print("\t\t\t\t\t--------------------\n\n");

        //System.out.println(BasicComputer.returnGeneralComputerData());
        System.out.println(JOptionPane.showInputDialog(BasicComputer.returnGeneralComputerData()));

        BasicComputer.setUpSSD(JOptionPane.showInputDialog("Your computer includes HDD 1TB, if you want " + "SSD," +
                " write the capacity of the disk (128/256/500), else write \"BASIC\""));
        System.out.println(BasicComputer.returnSSD());

        BasicComputer.setUpHeadphones(JOptionPane.showInputDialog("Do you want to add headphones for only $35? (YES/NO)"));
        System.out.println(BasicComputer.returnHeadphones());

        BasicComputer.setUpWebCam(JOptionPane.showInputDialog("Do you want to add webcam for only $140? (YES/NO)"));
        System.out.println(BasicComputer.returnWebcam());

        BasicComputer.setUpPrinter(JOptionPane.showInputDialog("Do you want to add printer fpr only $350? (YES/NO)"));
        System.out.println(BasicComputer.returnPrinter());

        System.out.print("\n\nThanks for buying at COMPUTHOR E-COMMERCE!\n");
        System.out.println("The the total price of your computer is $" + BasicComputer.returnComputerFinalPrice());
    }
}
