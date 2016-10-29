

import java.util.Scanner;

public class PrintMatrix_1a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The array is: ");
        int n = sc.nextInt();
        int[][] myArr = new int[n][n];
        int count = 1;
        int row = 0;
        int col = 0;

        //insert matrix
        for (row = 0; row < n; row++) {
            for (col = 0; col < n; col++) {
                myArr[col][row] = count;
                count++;
            }
        }

        //print
        for (row = 0; row < n; row++) {
            for (col = 0; col < n; col++) {
                System.out.print(myArr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
