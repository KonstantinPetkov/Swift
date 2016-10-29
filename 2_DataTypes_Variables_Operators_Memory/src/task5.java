

public class task5 {

    public static void main(String[] args) {

        //1-st way
        int x = 2;
        int y = 3;
        x ^= y;
        y ^= x;
        x ^= y;

        //2-nd way
        int a = 4;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("x: " + x + "  y: " + y);
        System.out.println("a: " + a + "  b: " + b);

    }

}
