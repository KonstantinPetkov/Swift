

import java.util.Scanner;

public class Task2d_PrintSplitIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The array is: ");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        int row = 0;
        int left = 0;
        int right = 0;
        
        for (row = 0; row < n; row++) {
            myArr[row] = sc.nextInt();
        }
        
        for (row = 0; row < n - 1; row++) {    
            left += myArr[row];
            for (int col = row + 1; col < n; col++) {  
                right += myArr[col];

            }
            if (left == right) {
                System.out.print(row + 1); 
                break;
            } else if (left != right && row == n - 2) {
                System.out.println("Nope");
            }
            right = 0;
        }

    }
}
