

import java.util.Scanner;

public class Task3c_PrintChristmasTree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        for (x = 1; x < n; x++) {
            for (y = 1; y <= (n-x); y++){
                System.out.print(" ");
            }
            for (z = 0; z < (x + (x-1)); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (x = 1; x < n; x++){
            System.out.print(" ");       
        }
        System.out.println("*");
        
        for (x = 1; x < n-1; x++){
            System.out.print(" ");       
        }
        System.out.println("***"); 
    }
}
