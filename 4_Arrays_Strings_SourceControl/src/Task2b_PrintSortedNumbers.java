

import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        
        String str = sc.nextLine();
        String[] myArr = str.split(",");

        int[] intMyArr = new int[myArr.length];

        for (int n = 0; n < myArr.length; n++) {
            intMyArr[n] = Integer.parseInt(myArr[n]);
        }
        
        //sorts the numbers correctly.
        Arrays.sort(intMyArr); 
        System.out.println("The sorted numbres are: " + Arrays.toString(intMyArr));
    }
}
