

public class task6 {

    public static void main(String[] args) {

        double i = 1234567;

        double d = i / 86400;
        System.out.printf("%.0f" + " Days, ", d);

        double h = (24 * (d % 1));
        System.out.printf("%.0f" + " Hours, ", h);

        double m = (60 * (h % 1));
        System.out.printf("%.0f" + " Minutes, ", m);

        double s = (60 * (m % 1));
        System.out.printf("%.0f" + " Sec.", s);
        System.out.println();
    }
}
