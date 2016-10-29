package Market;

import java.util.Scanner;

public class Person {
    
    //fields    
    private static String fName;
    private static String sName;
    private static float balance;
    private static String[] person = new String[200];
    static int i = 0;
    
    Scanner sc = new Scanner(System.in);
    
    //constructor    
    public Person() {
        this.fName = sc.nextLine();
        setFName(fName);
        this.sName = sc.nextLine();
        setSName(sName);
        this.balance = sc.nextFloat();
        setBalance(balance);
    }
    
    //methods
    
    public static String registryPerson(String user) {
        for(int i = 0; i < 500; i++) {
            person[i] = user;
        }
        return user;
    }//registryPerson   
    
    public void buy() {
        if(this.balance <= Product.getPrice()) {
            System.out.println(fName + sName + "can’t afford" + Product.getName());
        } else {
            System.out.println(fName + sName + "bought" + Product.getName());
        }
    }//buy
    
    //set & get & checker methods   
    
    public void isBalancePositiv() {
        if(!(this.balance > 0)) {
            System.out.println("Balance can’t be negative.");
        }
    }
    
    public void isNameNotNull() {
        if(!((this.fName == null) && (this.sName == null))) {
            System.out.println("Name can’t be empty.");
        }
    }
    
    public void setFName(String name) {
        this.fName = name;
    }
    
    public String getFName() {
        return fName;
    }
    
    public void setSName(String name) {
        this.sName = name;
    }
    
    public String getSName() {
        return sName;
    }
    
    private void setBalance(float balance) {
        this.balance = balance;
    }
    
    public static float getBalance() {
        return balance;
    }
    
    private void setPerson(String[] person) {
        this.person = person;
    }
    
    public static String[] getPerson() {
        return person;
    }
    
}
