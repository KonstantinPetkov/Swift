

import java.util.Scanner;

public class Task3a_IsPalindrome {

    public static boolean isPal(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPal(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = scanner.nextLine();
 
        if (isPal(string)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
