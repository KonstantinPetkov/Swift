package CredentialsManager;

import java.util.Scanner;

public class CredentialsManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string;

        while (!(string = sc.nextLine()).equals("END")) {
 
            String command = sc.nextLine();
            String user = sc.nextLine();
            String passwords = sc.nextLine();
            
            switch (command.toUpperCase()) {
                case "ENROL":
                    if (!Credentials.existUser(user)) {
                        Credentials account = new Credentials(user, passwords);
                        Credentials.addUser(user);
                        account.savePassword(passwords);
                        System.out.println("ENROLL success");
                        break;
                    } else {
                        System.out.println("ENROLL fail");
                        break;
                    }
                case "CHPASS":
                    String newPass = sc.nextLine();
                    if (Credentials.existUser(user)) {
                        if (Credentials.findUser(user).checkPassword(password)) {
                            Credentials.findUser(user).setPassword(newPass);
                            Credentials.findUser(user).savePassword(newPass);
                            System.out.println("CHPASS success");
                            break;
                        } else {
                            System.out.println("CHPASS fail");
                            break;
                        }
                    }
                case "AUTH":
                    if (!Credentials.findUser(user).checkPassword(passwords)) {
                        System.out.println("AUTH fail");
                    } else if (!Credentials.existUser(user)) {
                        System.out.println("AUTH fail");
                    } else {
                        System.out.println("AUTH success");
                        break;
                    }
            }//switch
            command = sc.nextLine();

        }//while    

    }//main
}//classCredentialsManager

