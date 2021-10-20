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

        // Full Name Option
        String userCompleteName=JOptionPane.showInputDialog("Enter your full name");
        System.out.println(userCompleteName);

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

        // COMPLETE REGISTRATION
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("***** SUCCESSFUL REGISTRATION *****");
        System.out.println("***********************************");
        System.out.println("***********************************");

    }
}
