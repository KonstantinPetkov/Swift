

import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int word = 1;
        int i = 0;
        
        for (i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i-1) != ' ') {
                word++;
            }
        }
        System.out.println("The number of the words: " + word);
    }
}
