

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("The decimal number is: ");
        int n = sc.nextInt();
        
        System.out.println("The binary number is: " + Integer.toBinaryString(n));
        System.out.println("The hexadecimal number is: " + Integer.toHexString(n));                
    }
    
}
