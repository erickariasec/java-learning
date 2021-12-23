package poo.latecnologiaavanza.constructor;

import javax.swing.*;

public class ConstructorArrayUse {
    public static void main(String[] args) {

        int nElements = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));

        ConstructorArray constructorArray = new ConstructorArray(nElements);
        constructorArray.setPrinter();
    }
}
