import javax.swing.*;

public class ApplicationAccess {
    public static void main(String[] args) {

        String generatedPassword="Erick1234";
        String userPassword="";

        while (generatedPassword.equals(userPassword)==false){
            userPassword= JOptionPane.showInputDialog("Enter the password, please");

            if (generatedPassword.equals(userPassword)==false){
                System.out.println("\t\t**INCORRECT PASSWORD**\n\t\t**TRY AGAIN, PLEASE!**\n");
            }

        }
        System.out.println("\t----------------------------\n");
        System.out.println("\t******CORRECT PASSWORD******\n\t\t**ACCESS ALLOWED!**\n");
        System.out.println("\t----------------------------\n");
    }
}
