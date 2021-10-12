import javax.swing.*; // This package contains JOptionPane Class and showInputDialog Method

public class IdealWeight {
    public static void main(String[] args) {

        String genre="";

        do{
            genre=JOptionPane.showInputDialog("Enter your genre H/M");
        } while (!genre.equalsIgnoreCase("H") && !genre.equalsIgnoreCase("M"));
       // while (genre.equalsIgnoreCase("H")==false && genre.equalsIgnoreCase("M")==false);

        int height=Integer.parseInt(JOptionPane.showInputDialog("Enter your HEIGHT in cm"));
        int idealWeight=0;

        // FOR MAN
        if (genre.equalsIgnoreCase("H")){
            idealWeight=(height-110);
        }

        // FOR WOMAN
        else if (genre.equalsIgnoreCase("M")){
            idealWeight=(height-120);
        }

        System.out.println("Your ideal weight is " + idealWeight + " kg!");
    }
}
