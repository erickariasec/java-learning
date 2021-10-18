import javax.swing.*;

public class ArraysUse2 {
    public static void main(String[] args) {

        String [] countries=new String[8];

        for(int i=0; i<8; i++){
            countries[i]= JOptionPane.showInputDialog("Enter country " + (i+1));
        }

        /*countries [0]="Spain";
        countries [1]="Mexico";
        countries [2]="Colombia";
        countries [3]="Peru";
        countries [4]="Chile";
        countries [5]="Argentina";
        countries [6]="Ecuador";
        countries [7]="Venezuela";*/

        //String [] countries={"Spain", "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};

        /*for(int i=0; i<countries.length; i++){
            System.out.println("Country " + (i+1) + ": " + countries[i]);
        }*/

        // BUCLE FOR EACH
        for(String element:countries){
            System.out.println("Country " + element);
        }

    }
}
