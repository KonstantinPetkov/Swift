

import java.util.Scanner;

public class Task4a_StringWoVowels {
    
    public static void main(String[] args) {
        
        String sOrig;
        String sNew;
        
        Scanner sc = new Scanner(System.in);
        sOrig = sc.nextLine();

        sNew = sOrig.replaceAll("[aeiouAEIOU]", "");
        System.out.println(sNew);
    }
    
}
