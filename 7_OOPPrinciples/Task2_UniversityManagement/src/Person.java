package Task2_UniversityManagement;

public abstract class Person {
    
    //fields
    String _name;
    String _phoneNumber;
    int _tolerance;
    
    //constructor
    public Person(String name, String phoneNumber){
        _name = name;
        _phoneNumber = phoneNumber;
        _tolerance = 20;
    }
    
    //methods
    
    abstract double work(Person[] people, int peopleCount);
    
    String getName(){
        return _name;
    }
    
    int getTolerance(){
        return _tolerance;
    }
    
    void increaseTolerance(int value) {
        _tolerance += value;
    }
    
    void decreaseTolerance(int value){
        _tolerance -= value;
    }
}
