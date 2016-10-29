

import java.util.Scanner;

public class Task2b_PrintReversedSequence {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.nextLine(); 

        //String sNum = Integer.toString(num);
        String sNumFinal = "";
        
        for (int i = num.length() - 1; i >= 0; i--) {
            sNumFinal += num.charAt(i);
        }
        System.out.println("The reversed number is: " + sNumFinal);
    }
}
