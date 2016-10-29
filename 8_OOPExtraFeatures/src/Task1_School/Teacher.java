package Task1_School;

public class Teacher extends Class {
    
    //fields
    private String _teachName;
    
    //constructor
    public Teacher(String name, String className, String teachName) {
        super(name, className);
        _teachName = teachName;
    }
    
}
