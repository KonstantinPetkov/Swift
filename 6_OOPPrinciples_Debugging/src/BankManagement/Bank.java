package BankManagement;

public class Bank {
    
    //fields
    private double assets;
    private Account[] accounts;
    private int numbers;
    
    //constructor
    public Bank() {
        accounts = new Account[100];
        numbers = 0;
    }
    
    //methods
    void addFunds(double amount) {
        if (amount <= 0) {
            return;
        }
    }
    
    void openAccount(String name, String govId, String username, String password) {
        Account a = new Account();
        /*
        accounts[numbers] = a;
        numbers++;
        */
    }
    
    void closeAccount(String username, String password) {
        if(!Account.getPassword(password) && !Account.getUsername(username)) {
            System.out.println("CLOSE fail");
        } else {
            System.out.println("CLOSE success");
        }
    }
        
    void deposit(String username, double amount) {
        if(!Account.deposit(amount) && 
                !Account.getUsername(username)) {
            System.out.println("DEPOSIT fail");
        } else {
            System.out.println("DEPOSIT success");
        }
    }
    
    void withdraw(String username, String password, double amount) {
        if(!Account.getPassword(password) && !Account.getUsername(username) &&
                !Account.withdraw(amount)) {
            System.out.println("WITHDRAW fail");
        } else {
            System.out.println("WITHDRAW success");
        }
    }
    
    void transfer(String username, String password, double amount, String recipient) {
        if(!Account.getPassword(password) && !Account.getUsername(username) &&
                !Account.withdraw(amount) && !Account.depositRecipient(recipient)) {
            System.out.println("TRANSFER fail");
        } else {
            System.out.println("TRANSFER success");
        }
    }
    
    double getAssets() {
        return assets;
    }
    
}
