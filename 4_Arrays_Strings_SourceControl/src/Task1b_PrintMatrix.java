

import java.util.Scanner;

public class Task1b_PrintMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The array is: ");
        int n = sc.nextInt();
        int[][] myArr = new int[n][n];
        int count = 1;
        int count2 = n - 1;
        int row = 0;
        int col = 0;

        //insert matrix
        for (row = 0; row < n; row++) {
            for (col = 0; col < n; col++) {
                myArr[row][col] = count;
                count++;
            }
        }
        
        //print
        for (row = 0; row < n; row++) {
            for (col = 0; col < n; col++) {
                if (col % 2 == 0) {
                    System.out.print(myArr[col][row] + "  ");
                } else {
                    System.out.print(myArr[col][count2] + "  ");
                }
            }
            count2 -= 1;
            System.out.println();
        }
    }
}
