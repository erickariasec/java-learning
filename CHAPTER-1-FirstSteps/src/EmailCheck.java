import javax.swing.*;

public class EmailCheck {
    public static void main(String[] args) {

        boolean arroba=false;

        do{
            String userEmail= JOptionPane.showInputDialog("Enter your email, please");

            for (int i=0; i<userEmail.length(); i++){

                if (userEmail.charAt(i)=='@'){
                    arroba=true;
                    break;
                }
            }

            if (arroba==true){
                System.out.println("\n\n***Email entered is CORRECT!***");
            }
            else {
                System.out.println("\nINCORRECT EMAIL, TRY AGAIN!");
            }
        } while (arroba==false);

    }
}
