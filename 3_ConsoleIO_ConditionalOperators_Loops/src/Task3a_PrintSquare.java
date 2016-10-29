

import java.util.Scanner;

public class Task3a_PrintSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the square: ");
        int n = sc.nextInt();

        int x = 0;
        int y = 0;

        for (x = 1; x <= n; x++) {
            for (y = 1; y <= n; y++) {
                if (x == 1 || x == n || y == 1 || y == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
