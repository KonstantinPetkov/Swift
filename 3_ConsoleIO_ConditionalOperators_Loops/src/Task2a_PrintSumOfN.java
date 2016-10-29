

import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] args) {

        int sum;
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the number: ");
            
            int score = 0;
            sum = 0;
            String line = sc.nextLine();
            sc = new Scanner(line);
            
            while (sc.hasNextInt()) {
                score = sc.nextInt();
                sum += score;
            }
            System.out.println("Sum = " + sum);
        } while (sum != 0);
    }
}
