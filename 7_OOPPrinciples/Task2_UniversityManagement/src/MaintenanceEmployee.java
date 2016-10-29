package Task2_UniversityManagement;

public class MaintenanceEmployee extends Employee{
    
    //constructor
    public MaintenanceEmployee(String name, String phoneNumber) {
        super(name, phoneNumber, 15);
    }    
    
    @Override
    double work(Person[] people, int peopleCount) {
        for(int i = 0; i < peopleCount; i++) {
            people[i].increaseTolerance(2);
        }
        return _salary;
    }
}
