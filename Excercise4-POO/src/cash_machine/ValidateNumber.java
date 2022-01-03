package cash_machine;

public class ValidateNumber {

    // This static method belongs to ValidateNumber Class
    public static boolean isNum(String optionMenuSelected){
        try{
            int optionNumber = Integer.parseInt(optionMenuSelected);
            return true;    // True if Achieve Casting (Change from String to Integer)
        }catch (NumberFormatException mistake){ // Catch the mistake
            System.out.println(mistake);
            return false;
        }
    }

    // THIS IS ANOTHER WAY TO CHANGE STRING TO INT
    /*public static void isNum(String optionMenuSelected){
        int optionNumber = Integer.parseInt(optionMenuSelected);
    }*/

}
