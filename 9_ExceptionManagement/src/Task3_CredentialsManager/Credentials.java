package Task3_CredentialsManager;

public class Credentials {

    //fields
    private String username;
    private String password;
    private String[] pass = new String[100];
    private static String[] users = new String[100];
    static int i = 0;
    static int j = 0;
    private int oldPass;

    //constructor
    public Credentials(String user, String password) {
        this.username = user;
        this.password = password;
    }

    //methods    
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

    public boolean checkPassword(String password) {
        boolean rightPass = false;

        if (!this.password.equals(password)) {
            System.out.println("fail");
        } else {
            rightPass = true;
        }
        return rightPass;
    }//checkPassword

    public boolean changePassword(String oldPassword, String newPassword) throws OldPasswordConflictException {
        for (int i = 0; i < oldPass; i++) {
            if (!pass[i].equals(newPassword)) {
                throw new OldPasswordConflictException("CHPASS failed", 0);
            } else {
                throw new OldPasswordConflictException("CHPASS fail", (oldPass - i));
            }
        }        
        return true;
    
    }//changePassword

    //getMethod & setMethod
    private void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
