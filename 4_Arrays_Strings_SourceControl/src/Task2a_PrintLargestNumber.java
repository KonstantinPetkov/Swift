

import java.util.Scanner;

public class Task2a_PrintLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");

        String str = sc.nextLine();
        String[] myArr = str.split(",");

        int[] intMyArr = new int[myArr.length];

        for (int n = 0; n < myArr.length; n++) {
            intMyArr[n] = Integer.parseInt(myArr[n]);
        }

        int maxNum = intMyArr[0];
        for (int k = 0; k < myArr.length; k++) {
            if (intMyArr[k] > maxNum) {
                maxNum = intMyArr[k];
            }
        }
        System.out.println(maxNum);
    }
}
