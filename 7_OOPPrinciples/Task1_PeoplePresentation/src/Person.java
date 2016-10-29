package Task1_PeoplePresentation;

public abstract class Person {

    //fields
    private String _firstName;
    private String _lastName;

    //constructor
    Person(String fName, String lName) {
        _firstName = fName;
        _lastName = lName;
    }
    
    abstract String getInfo();
    
    String getCommonInfo(){
        return String.format("First name: %s%nLast name: %s", _firstName, _lastName);
    }

}
