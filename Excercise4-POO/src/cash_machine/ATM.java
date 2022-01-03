package cash_machine;

import javax.swing.*;

public class ATM {

    public int currentBalance = 1200;
    public String password = "Erick1234";

    // MAIN MENU - Method to show Main Menu
    public void setMenu(){
        int option = 0;
        do{
           String optionMenuSelected = JOptionPane.showInputDialog(null,"" +
                   "1. Check Balance\n" +
                   "2. Deposit\n" +
                   "3. Withdraw\n" +
                   "4. Change Password\n" +
                   "5. Exit\n\n" +
                   "Enter your option: ");

           if(optionMenuSelected != null && ValidateNumber.isNum(optionMenuSelected)){
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
                       JOptionPane.showMessageDialog(null, "Thank you for your attention!");
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
        int deposit = 0;

        depositString = JOptionPane.showInputDialog(null, "Enter the value you want to deposit:");
        if (depositString != null && !depositString.equals("") && ValidateNumber.isNum(depositString)){
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

        if(withdrawString == null){
            // Return Main Menu
        }else if(!withdrawString.equals("")){
            if(withdrawString.equals(password)){
                withdrawString = JOptionPane.showInputDialog(null, ""
                + "a) $20\n"
                + "b) $50\n"
                + "c) $100\n"
                + "d) $500\n"
                + "e) $1000\n"
                + "f) Another amount\n\n"
                + "Enter your option: ");

                if(withdrawString != null){
                    if(!withdrawString.equals("")){
                        switch (withdrawString){
                            case "a":
                                if((currentBalance - 20) >= 10){
                                    currentBalance -= 20;
                                    JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                                }else{
                                    JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                                }
                                break;

                            case "b":
                                if((currentBalance - 50) >= 10){
                                    currentBalance -= 50;
                                    JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                                }else{
                                    JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                                }
                                break;

                            case "c":
                                if((currentBalance - 100) >= 10){
                                    currentBalance -= 100;
                                    JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                                }else{
                                    JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                                }
                                break;

                            case "d":
                                if((currentBalance - 500) >= 10){
                                    currentBalance -= 500;
                                    JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                                }else{
                                    JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                                }
                                break;

                            case "e":
                                if((currentBalance - 1000 >= 10)){
                                    currentBalance -= 1000;
                                    JOptionPane.showMessageDialog(null, "Your current balance is " + currentBalance);
                                }else{
                                    JOptionPane.showMessageDialog(null, "You need at least 10 dollars in your account");
                                }
                                break;

                            case "f":
                                withdrawString = JOptionPane.showInputDialog(null, "Enter the amount to withdraw:");
                                if((withdrawString != null && !withdrawString.equals("") && ValidateNumber.isNum(withdrawString)
                                        && ((currentBalance - Integer.parseInt(withdrawString) >= 10)) && (Integer.parseInt(withdrawString) > 0))){
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
                    }
                }
            }else {
                JOptionPane.showMessageDialog(null, "Incorrect Password");
            }
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
