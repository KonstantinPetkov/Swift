package Task2_UniversityManagement;

public class Student extends Person {
    
    //fields
    String _facultyNumber;
    String[] _subjects;
    
    //constructor
    public Student(String name, String phoneNumber, String fNumber, String[] subjects) {
        super(name, phoneNumber);
        _facultyNumber = fNumber;
        _subjects = subjects;
    }
    
    @Override
    double work(Person[] people, int peopleCount) {
        
        _tolerance += 2;
        
        for(int i = 0; i < peopleCount; i++){
            if(people[i] instanceof MaintenanceEmployee){
                people[i].decreaseTolerance(1);
            }
        }
        if(_tolerance >= 50){
            return 10;
        }
        return 0;
    }    
}
