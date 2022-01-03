package cash_machine;

import javax.swing.*;

public class ATM {

    public int currentBalance = 1200;
    public String password = "Erick1234";
    public String passwordConfirmation = "Erick1234";
    public String userName = "Erick Arias";
    public String ID = "1721055022";

    // CREATE ACCOUNT - Method to Create Account
    public void setAccountCreator(){
        userName = JOptionPane.showInputDialog(null, "WELCOME TO THE INTERNATIONAL BANK\n\n" +
                "Enter your name, please:");
        ID = JOptionPane.showInputDialog(null, "Enter your ID, please:");

        do{
            password = JOptionPane.showInputDialog(null, "Enter your new password:");
            passwordConfirmation = JOptionPane.showInputDialog(null, "Retype your password:");

            if(!password.equals(passwordConfirmation)){
                JOptionPane.showMessageDialog(null, "The password does not match!\n\nTRY AGAIN!");
            }

        }while(!password.equals(passwordConfirmation));

        currentBalance = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the value of your first deposit"));
        JOptionPane.showMessageDialog(null, "Account Created Succesfully");
    }

    // MAIN MENU - Method to show Main Menu
    public void setMenu(){
        int option = 0;
        do{
           String optionMenuSelected = JOptionPane.showInputDialog(null,"" +
                   userName + "\n" +
                   "ID: " + ID + "\n\n" +
                   "1. Check Balance\n" +
                   "2. Deposit\n" +
                   "3. Withdraw\n" +
                   "4. Change Password\n" +
                   "5. Exit\n\n" +
                   "Enter your option: ");

           if(ValidateNumber.isNum(optionMenuSelected)){
               option = Integer.parseInt(optionMenuSelected);

               switch (option){
                   // Check Balance
                   case 1:
                       setCheckBalance();
                       break;

                   // Deposit
                   case 2:
                       setDeposit();
                       break;

                   // Withdraw
                   case 3:
                       setWithdraw();
                       break;

                   // Change Password
                   case 4:
                       setChangePassword();
                       break;

                   // Exit
                   case 5:
                       JOptionPane.showMessageDialog(null, "Thank you for your attention " + userName + "!");
                       break;

                   default:
                       JOptionPane.showMessageDialog(null, "Option Not Available, Try Again!");
                       break;
               }
           }

        }while(option != 5);
    }

    // Method to Deposit
    public void setDeposit(){
        String depositString;
        int deposit;

        depositString = JOptionPane.showInputDialog(null, "Enter the value you want to deposit:");
        if (ValidateNumber.isNum(depositString)){
            deposit = Integer.parseInt(depositString);

            if (deposit > 0){
                currentBalance += deposit;
                JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter a valid quantity value!");
            }
        }
    }

    // Method to Withdraw
    public void setWithdraw(){
        String withdrawString;
        withdrawString = JOptionPane.showInputDialog(null, "Enter your password: ");

        if(withdrawString.equals(password)){
            withdrawString = JOptionPane.showInputDialog(null, ""
            + "1) $20\n"
            + "2) $50\n"
            + "3) $100\n"
            + "4) $500\n"
            + "5) $1000\n"
            + "6) Another amount\n\n"
            + "Enter your option: ");

            int withdraw = Integer.parseInt(withdrawString);

            switch (withdraw){
                // Withdraw $20
                case 1:
                    if((currentBalance - 20) >= 10){
                        currentBalance -= 20;
                        JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                    }else{
                        JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                    }
                    break;

                // Withdraw $50
                case 2:
                    if((currentBalance - 50) >= 10){
                        currentBalance -= 50;
                        JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                    }else{
                        JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                    }
                    break;

                // Withdraw $100
                case 3:
                    if((currentBalance - 100) >= 10){
                        currentBalance -= 100;
                        JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                    }else{
                        JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                    }
                    break;

                // Withdraw $500
                case 4:
                    if((currentBalance - 500) >= 10){
                        currentBalance -= 500;
                        JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                    }else{
                        JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                    }
                    break;

                // Withdraw $1000
                case 5:
                    if((currentBalance - 1000 >= 10)){
                        currentBalance -= 1000;
                        JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                    }else{
                        JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                    }
                    break;

                // Withdraw Another Amount
                case 6:
                    withdrawString = JOptionPane.showInputDialog(null, "Enter the amount to withdraw:");
                    if((ValidateNumber.isNum(withdrawString) && ((currentBalance - Integer.parseInt(withdrawString) >= 10)) && (Integer.parseInt(withdrawString) > 0))){
                        currentBalance -= Integer.parseInt(withdrawString);
                        JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                    }else{
                        JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid option!");
                break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect Password");
        }
    }

    // Method to Change Password
    public void setChangePassword(){
        String auxiliary;
        String newPassword;

        auxiliary = JOptionPane.showInputDialog(null, "Enter your current password: ");
        if(auxiliary.equals(password)){
            newPassword = JOptionPane.showInputDialog(null, "Enter your new password: ");
            if(newPassword.length() > 3){
                auxiliary = password;
                JOptionPane.showMessageDialog(null, "Your old password was " + auxiliary
                + "\n\nYour new password is "+ newPassword);
                password = newPassword;
            }else{
                JOptionPane.showMessageDialog(null, "Enter a password longer than 3 letters");
            }
        }else{
            JOptionPane.showMessageDialog(null, "The password does not match!");
        }
    }

    // Method to Check Balance
    public void setCheckBalance(){
        JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
    }

}
