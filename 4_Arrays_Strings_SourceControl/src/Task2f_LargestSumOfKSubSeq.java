

import java.util.Scanner;

public class Task2f_LargestSumOfKSubSeq {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The array and K is: ");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        int a = sc.nextInt();
        int row = 0;
        int col = 0;
        int i = 0;
        int number = 0;
        int max = 0;
        int sum = 0;

        for (row = 0; row < myArr.length; row++) {
            myArr[row] = sc.nextInt();
        }
        for (row = 0; row < myArr.length - a; row++) {
            for (col = row; col < a + row; col++) {
                sum += myArr[col];
            }
            if (sum > max) {
                max = sum;
                number = row;
            }
        }
        for (i = number; i < number + a; i++) {
            System.out.print(myArr[i] + " ");
        }

    }
}
