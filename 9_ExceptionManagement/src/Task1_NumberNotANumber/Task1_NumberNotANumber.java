package Task1_NumberNotANumber;

import java.util.Scanner;

public class Task1_NumberNotANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        while (!string.equals("END")) {
            checkIfIsANumber(string);
            string = sc.nextLine();
        }
    }

    private static void checkIfIsANumber(String string) {
        try {
            int i = Integer.parseInt(string);
            System.out.println("Number");
        } catch (NumberFormatException ex) {
            System.out.println("Not a number");
        }
    }
}
