

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {

    public static void main(String[] args) {

        String s;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        System.out.print("The even numbers are: ");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch) && ch % 2 == 0) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }
}
