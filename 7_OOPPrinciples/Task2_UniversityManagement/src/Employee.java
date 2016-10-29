package Task2_UniversityManagement;

public abstract class Employee extends Person{

    //fields
    double _salary;
    
    //constructor
    public Employee(String name, String phoneNumber, double salary) {
        super(name, phoneNumber);
        _salary = salary;
    }
    
    
}
