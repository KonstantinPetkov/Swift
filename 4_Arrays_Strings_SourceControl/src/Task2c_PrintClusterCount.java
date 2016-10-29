

import java.util.Scanner;
import java.util.Arrays;

public class Task2c_PrintClusterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The array is: ");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        Arrays.sort(myArr);
        int row = 0;
        int count = 0;
        int count2 = 0;

        for (row = 0; row < myArr.length; row++) {
            System.out.printf("%d element: ", row + 1);
            myArr[row] = sc.nextInt();
        }
        for (row = 0; row < myArr.length - 1; row++) {
            if (myArr[row] == myArr[row + 1]) {
                count++;
            }
            if ((myArr[row] != myArr[row + 1] && count != 0)
                    || ((row + 1 == myArr.length - 1) && count != 0)) {
                count2++;
                count = 0;
            }
        }
        System.out.print(count2);
        
    }
}
