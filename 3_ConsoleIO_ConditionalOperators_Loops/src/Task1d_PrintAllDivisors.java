

import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 0;
        System.out.print("1,  ");
        
        for (i = 2; i <= n/2; i++) {
            if (n%i == 0) {
                System.out.print(i + " , ");
            }
        }
        System.out.println(n);
    }
    
}
