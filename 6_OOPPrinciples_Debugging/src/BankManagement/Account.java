package BankManagement;

import java.util.Scanner;

public class Account {

    //fields
    private static String name;
    private static String govId;
    private static double balance;
    private static String username;
    private static String password;
    private static String recipient;
    private String[] pass = new String[100];
    private static String[] users = new String[100];
    private Account[] accounts;
    private int numbers;
    static int i = 0;
    static int j = 0;

    Scanner sc = new Scanner(System.in);

    //constructor
    public Account() {
        this.name = sc.nextLine();
        setName(name);
        this.govId = sc.nextLine();
        setGovId(govId);
        this.balance = sc.nextDouble();
        setBalance(balance);
        this.username = sc.nextLine();
        setUsername(username);
        this.password = sc.nextLine();
        setPassword(password);
    }

    //methods
    void deposit(double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            return;
        }
        balance -= amount;
    }
    
    static boolean depositRecipient(String recipient) {
        if (amount <= 0) {
            balance += amount;
        }
        return balance;
    }

    //User
    public static void addUser(String userName) {
        users[j] = userName;
        j++;
    }//addUser 

    public static String findUser(String user) {
        int f = 0;
        for (int u = 0; u < users.length; u++) {
            if (users[u].equals(user)) {
                f = u;
            }
        }
        return users[f];
    }//findUser 

    public static boolean existUser(String user) {
        boolean existUser = false;
        for (int u = 0; u < users.length; u++) {
            if (users[u].equals(user)) {
                existUser = true;
            }
        }
        return existUser;
    }//existUser 

    //Password
    public void savePassword(String newPassword) {
        pass[i] = newPassword;
        setPassword(newPassword);
        i++;
    }//savePass 

    public boolean checkPassword(String passwords) {
        boolean rightPass = false;
        if (!this.password.equals(passwords)) {
            System.out.println("fail");
        } else {
            rightPass = true;
        }
        return rightPass;
    }//checkPassword

    public void changePassword(String oldPass, String newPass) {
        if (!oldPass.equals(pass[i])) {
            System.out.println("fail");
        } else {
            savePassword(newPass);
        }
    }//changePass

    static boolean getPassword(String password) {
        return true;
    }

    static boolean getUsername(String username) {
        return true;
    }

    //getMethod & setMethod & chekerMethod
    double getBalance() {
        return balance;
    }

    boolean hasAccess(String password) {
        boolean rightPass = false;
        if (!this.password.equals(password)) {
            System.out.println("fail");
        } else {
            rightPass = true;
        }
        return rightPass;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    String getUsername() {
        return username;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return password;
    }

    String getGovId() {
        return govId;
    }

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setGovId(String govId) {
        this.govId = govId;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

}
