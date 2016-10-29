package Task1_School;

public class Student extends Class {
    
    //fields
    private String _studName;
    private String _facultyNumber;
    
    //constructor
    public Student(String name, String className, String studName, String facultyNumber) {
        super(name, className);
        _facultyNumber = facultyNumber;
        _studName = studName;                
    }
    
}
