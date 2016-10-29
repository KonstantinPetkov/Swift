

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0;
        
        while (n != 0) {
            a = a*10 + n%10;
            n = n/10;   
        }
        System.out.println(a);
    }
    
}
