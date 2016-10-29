

import java.util.Scanner;

public class Task1e_IsPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        int i = 0;

        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not prime number");
        }
    }

}
