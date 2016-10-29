

public class task2 {

    public static void main(String[] args) {

        int year = 2016;
        boolean test = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.println(test);

    }

}
