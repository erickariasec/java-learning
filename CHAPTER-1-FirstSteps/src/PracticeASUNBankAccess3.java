import javax.swing.*;

public class PracticeASUNBankAccess3 { // Practice All Seen Until Now - Bank Access
    public static void main(String[] args) {

        System.out.print("\n\t\tASSOCIATION OF SAVINGS AND CREDITS ARIAS\n");
        System.out.print("\t\t----------------------------------------\n\n");

        System.out.print("\t\t**** Welcome to your Online Banking ****\n");
        System.out.print("\t\t************* REGISTER NOW *************\n");
        System.out.print("\n\t\t----------------------------------------\n\n");

        // REGISTRATION MENU
        // INITIALIZE VARIABLES VARIABLES
        int arroba=0;   // for Email
        boolean dot=false;  // for Email
        int ID;     // for ID Number
        int signIn;     // for Sign In

        // Full Name Option
        String userFullName=JOptionPane.showInputDialog("Enter your full name");
        System.out.println("***FULL NAME REGISTERED CORRECTLY***");

        // ID Number Option
        do{
            String userID=JOptionPane.showInputDialog("Enter your ID number");
            if(userID.length()!=10){
                System.out.println("***INVALID ID, TRY AGAIN***");
                ID=0;
            }
            else{
                System.out.println("***CORRECT ID***");
                ID=1;
            }
        }
        while(ID==0);

        // Email Option
        do{
            String userEmail=JOptionPane.showInputDialog("Enter your email");
            for(int i=0; i<userEmail.length(); i++){
                if(userEmail.charAt(i)=='@'){
                    arroba=1;
                }
                if(userEmail.charAt(i)=='.'){
                    dot=true;
                }
            }
            if((arroba==1) && (dot==true)){
                System.out.println("***CORRECT EMAIL***");
            }
            else{
                System.out.println("***INVALID EMAIL, TRY AGAIN***");
            }
        }
        while((arroba==0) || (!dot));

        // Password Option
        String userPassword= JOptionPane.showInputDialog("Enter your new password");
        System.out.print("PASSWORD SAVED CORRECTLY\n\n\n");
        JOptionPane.showMessageDialog(null, "SUCCESSFUL REGISTRATION"); // extracted from Google

        // COMPLETE REGISTRATION
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("***** SUCCESSFUL REGISTRATION *****");
        System.out.println("***********************************");
        System.out.println("***********************************");


        // SIGN IN MENU
        JOptionPane.showMessageDialog(null, "TO VALIDATE YOUR DATA, SIGN IN, PLEASE"); // Google
        do{
            System.out.print("\n\n\n***SIGN IN***\n\n");
            String registeredFullName=JOptionPane.showInputDialog("Enter your full name");
            String registeredUserPassword=JOptionPane.showInputDialog("Enter your password");
            if((registeredFullName.equals(userFullName)) && (registeredUserPassword.equals(userPassword))){
                System.out.print("\n\n***ACCESS ALLOWED***\n\n");
                signIn=1;
            }
            else{
                System.out.print("\n\n***INVALID NAME OR PASSWORD***\n");
                System.out.print("**********TRY  AGAIN**********\n\n");
                signIn=0;
            }
        } while (signIn==0);

        System.out.println("Welcome " + userFullName + " it´s a pleasure!");
        System.out.println("Thanks for being part of our Association of Savings and Credits");

    }
}