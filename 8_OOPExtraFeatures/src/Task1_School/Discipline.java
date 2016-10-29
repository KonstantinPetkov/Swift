package Task1_School;

public class Discipline extends Teacher{
    
    //fields
    private String _discName;
    private int _hoursPerWeek;
    
    //constructor
    public Discipline(String name, String className, String teachName, String discName, int hoursPerWeek) {
        super(name, className, teachName);
        _discName = discName;
        _hoursPerWeek = hoursPerWeek;
    }
    
}
