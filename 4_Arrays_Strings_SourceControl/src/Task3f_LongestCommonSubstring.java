

import java.util.Scanner;

public class Task3f_LongestCommonSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insert strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = str1.length();
        int m = str2.length();
        int row = 0;
        int col = 0;
        int[][] myArr = new int[n + 1][m + 1];
        int a = 0;
        int b = -1;

        for (row = 1; row < n + 1; row++) {
            for (col = 1; col < m + 1; col++) {
                if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
                    myArr[row][col] = myArr[row - 1][col - 1] + 1;
                    if (myArr[row][col] > a) {
                        a = myArr[row][col];
                        b = row;
                    }
                } else {
                    myArr[row][col] = 0;
                }
            }

        }
        System.out.println(str1.substring(b - a, b));
    }
}
