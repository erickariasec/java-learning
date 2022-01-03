package cash_machine;

public class ATM_Use {
    public static void main(String[] args) {

        ATM cashMachine = new ATM(); // Instantiating ATM Class
        cashMachine.setAccountCreator(); // Calling Account Creator
        cashMachine.setMenu(); // Calling Main Menu

    }
}
