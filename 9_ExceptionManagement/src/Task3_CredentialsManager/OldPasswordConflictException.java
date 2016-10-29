package Task3_CredentialsManager;

public class OldPasswordConflictException extends Exception {
    
    String str;
    int index;
    
    public OldPasswordConflictException(String str, int i){
       this.str = str;
       this.index = i;
    }
    
    public void getPasswordConflictIndex(){
        System.out.println("Password matches a recently used one: " + this.str + this.index);
    }
    
}
