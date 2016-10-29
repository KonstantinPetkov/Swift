

import java.util.Scanner;

public class Task1c_PrintMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The array is: ");
        int n = sc.nextInt();
        int[][] myArr = new int[n][n];
        int row = 1;
        int col = 1;
        int i = 0;
        int j = 0;
        
        //insert matrix
        for (i = 1; i <= n * n; i++) {
            myArr[row - 1][col - 1] = i;
            
            if ((row + col) % 2 == 0) {
                if (col < n) {
                    col++;
                } else {
                    row += 2;
                }
                if (row > 1) {
                    row--;
                }
            } else {
                if (row < n) {
                    row++;
                } else {
                    col += 2;
                }
                if (col > 1) {
                    col--;
                }
            }
        }
        
        //print matrix
        for (i = 0; i < n; i++) {
            for (j = 0; j < myArr.length; j++) {
                System.out.print(myArr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}


