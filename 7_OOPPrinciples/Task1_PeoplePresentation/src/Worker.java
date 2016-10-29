package Task1_PeoplePresentation;

public class Worker extends Person {

    //fields
    private double _weekSalary;
    private double _workHoursPerDay;

    //constructor
    Worker(String fName, String lName, double salary, double hours) {
        super(fName, lName);
        _weekSalary = salary;
        _workHoursPerDay = hours;
    }

    @Override
    String getInfo() {
        return String.format("%s%n"
                + "Occupation: Worker%n"
                + "Week salary: %.2f%n"
                + "Hours per day: %f%n"
                + "Salary per hour: %.2f",
                getCommonInfo(), _weekSalary, _workHoursPerDay, _weekSalary / (_workHoursPerDay * 5));
    }
}
