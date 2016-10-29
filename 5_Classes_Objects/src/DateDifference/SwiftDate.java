package DateDifference;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class SwiftDate {

    public int day;
    public int month;
    public int year;
    private String date;
    public Date d1;
    public Date d2;

    Scanner sc = new Scanner(System.in);

    public SwiftDate() {
        System.out.println("Enter a date:");
        this.date = sc.nextLine();
        setDate(date);
    }

    boolean isLeapYear(int year) {
        boolean leap = false;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            leap = true;
        }
        return leap;
    }

    int getCentury(int year) {
        int century;
        century = year / 100 + 1;
        return century;
    }

    public int getDaysDifference(SwiftDate date) {

        SimpleDateFormat format = new SimpleDateFormat("year, month, day");
        String date1 = getDate();
        String date2 = date.getDate();

        try {
            d1 = format.parse(date1);
            d2 = format.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int diff = (int) (d2.getTime() - d1.getTime());
        int dDiff = diff / (24 * 60 * 60 * 1000);

        System.out.print(dDiff + " days, ");
        if (dDiff < 0) {
            dDiff *= -1;
        }
        return dDiff;
    }

    public void printInfo() {

        System.out.print(getDate() + " - " + getCentury(this.year) + "  century.");
        if (isLeapYear(this.year)) {
            System.out.println("The year is leap.");
        } else {
            System.out.println("The year is not leap.");
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
