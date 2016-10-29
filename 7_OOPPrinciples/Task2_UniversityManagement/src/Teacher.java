package Task2_UniversityManagement;

public class Teacher extends Employee {
    
    //fields
    String[] _subjects;
    
    //constructor
    public Teacher(String name, String phoneNumber, String[] subjects) {
        super(name, phoneNumber, 25);
        _subjects = subjects;
    }
    
    @Override
    double work(Person[] people, int peopleCount) {
        for(int i = 0; i < peopleCount; i++){
            Person other = people[i];
            if(other instanceof MaintenanceEmployee){
                other.decreaseTolerance(3);
            }else if(other instanceof Student) {
                other.increaseTolerance(3);
            }else if(other instanceof AdministrationEmployee) {
                other.decreaseTolerance(1);
            }
        }
        return _salary;
    }
    
}
