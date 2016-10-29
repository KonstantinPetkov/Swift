

import java.util.Scanner;

public class Task3e_ConvertibleStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;
        int i = 0;
        
        for (i = 0; i < str2.length(); i++) {
            if (str1.contains(str2.substring(i, i + 1))) {
                count++;
            }
        }
        if (count == str2.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
