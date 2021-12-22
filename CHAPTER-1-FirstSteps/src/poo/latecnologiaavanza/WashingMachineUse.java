package poo.latecnologiaavanza;

public class WashingMachineUse {
    public static void main(String[] args) {

        // Creating the first object / Instantiating the Class
        WashingMachine washingMachineLG = new WashingMachine();
        String colorLG = washingMachineLG.color = "White";
        String brandLG = washingMachineLG.brand = "LG";
        int serialNumberLG = washingMachineLG.serialNumber = 7564812;
        double priceLG = washingMachineLG.price = 999.99;

        System.out.println("The first washing machine has these specs: ");
        System.out.println("Color: " + colorLG);
        System.out.println("Brand: " + brandLG);
        System.out.println("Serial Number: " + serialNumberLG);
        System.out.println("Price: $" + priceLG);

        // Creating the second object / Instantiating the Class
        WashingMachine washingMachineSamsung = new WashingMachine();
        String colorSamsung = washingMachineSamsung.color = "Gray";
        String brandSamsung = washingMachineSamsung.brand = "Samsung";
        int serialNumberSamsung = washingMachineSamsung.serialNumber = 6541377;
        double priceSamsung = washingMachineSamsung.price = 1299.49;

        System.out.println("\nThe second washing machine has these specs: ");
        System.out.println("Color: " + colorSamsung);
        System.out.println("Brand: " + brandSamsung);
        System.out.println("Serial Number: " + serialNumberSamsung);
        System.out.println("Price: $" + priceSamsung);

    }
}
