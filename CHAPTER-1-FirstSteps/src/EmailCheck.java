import javax.swing.*;

public class EmailCheck {
    public static void main(String[] args) {

        int arroba=0;
        boolean dot=false;

        /* Remember that Java does not erase information of bucles, Java keep that
        * information for the next loop. For that reason, if at first time you entered
        * a dot, Java will detect and keep that dot for the next loop although in the
        * next loop you do not enter any dot. */

        do{
            String userEmail= JOptionPane.showInputDialog("Enter your email, please");

            for (int i=0; i<userEmail.length(); i++){

                if (userEmail.charAt(i)=='@'){
                    arroba=1;
                }
                if (userEmail.charAt(i)=='.'){
                    dot=true;
                }
            }

            if (arroba==1 && dot==true){
                System.out.println("\n\n***Email entered is CORRECT!***");
            }
            else {
                System.out.println("\nINCORRECT EMAIL, TRY AGAIN!");
            }
        } while (arroba==0 || dot==false);

    }
}
