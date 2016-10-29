package DateDifference;

public class DateDifference {

    public static void main(String[] args) {

        SwiftDate date = new SwiftDate();
        SwiftDate secondDate = new SwiftDate();
        date.printInfo();
        secondDate.printInfo();
        System.out.println(date.getDaysDifference(secondDate));
    }
}
