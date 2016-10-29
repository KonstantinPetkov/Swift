package Task1_PeoplePresentation;

public class Student extends Person{
    
    //fields
    private String _facultyNumber;
    private int _lectureCount;
    private int _exerciseCount;
    
    //constructor
    Student(String fName, String lName, String fNumber, int lCount, int eCount) {       
        super(fName, lName);
        _facultyNumber = fNumber;
        _lectureCount = lCount;
        _exerciseCount = eCount;     
    }
    
    @Override
    String getInfo() {
        return String.format("%s%n"
                + "Occupation: Student%n"
                + "Faculty number: %s%n"
                + "Hours per day: %.2f",
                getCommonInfo(), _facultyNumber, 
                (2 * _lectureCount + 1.5 * _exerciseCount) / 5);
    }    
}
