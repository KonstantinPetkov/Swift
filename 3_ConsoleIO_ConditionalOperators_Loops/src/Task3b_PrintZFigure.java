

import java.util.Scanner;

public class Task3b_PrintZFigure {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int x = 0;
        int y = 0;
        
        for (x = 0; x < n; x++) {
            for (y = 0; y < n; y++) {
                if (x == 0 || x == n - 1 || y == n - 1 - x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 

    }
}
