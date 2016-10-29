package Task2_UniversityManagement;

public class AdministrationEmployee extends Employee {
    
    //fields
    String[] _subjects;
    
    //constructor
    public AdministrationEmployee(String name, String phoneNumber, String[] subjects) {
        super(name, phoneNumber, 19);
        _subjects = subjects;
    }
    
    @Override
    double work(Person[] people, int peopleCount) {
        for(int i = 0; i < peopleCount; i++){
            Person other = people[i];
            if(other instanceof MaintenanceEmployee){
                other.increaseTolerance(1);
            }else if(other instanceof Teacher || other instanceof Student) {
                other.increaseTolerance(3);
            }
        }
        return _salary;
    }
    
}
