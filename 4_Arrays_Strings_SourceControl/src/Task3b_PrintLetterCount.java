

import java.util.Scanner;

public class Task3b_PrintLetterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int count = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                char k = str.charAt(j);
                if (c == k && temp.indexOf(c) == -1) {
                    count = count + 1;
                }
            }
            if (temp.indexOf(c) == -1) {
                temp = temp + c; 
                System.out.println("letter: " + c + " occurs " + count);
            }
            // reset the counter for next iteration 
            count = 0;

        }

    }

}
