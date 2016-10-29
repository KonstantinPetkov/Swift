

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        
        int sum = 0;
                                
        while (a >= 10) {
            sum = sum + a%10;
            a = a/10;
        }           
        sum += a;
        System.out.println(sum);
    }  
    
}
