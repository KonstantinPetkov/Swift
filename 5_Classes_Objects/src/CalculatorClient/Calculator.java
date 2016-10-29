package CalculatorClient;

import java.util.Scanner;

public class Calculator {

    //fields
    private static int n;
    private static int m;
    private static String chooce;

    Scanner sc = new Scanner(System.in);

    //constructor
    public Calculator() {
        this.n = n;
        this.m = m;

        System.out.print("Enter your selection: ");
        System.out.print("1.Sum; ");
        System.out.print("2.Substract; ");
        System.out.print("3.Multiply; ");
        System.out.print("4.Divide; ");
        System.out.print("5.Percentage: ");
        int chooce = sc.nextInt();

        System.out.print("Enter first number: ");
        int n = sc.nextInt();

        System.out.print("Enter second number: ");
        int m = sc.nextInt();

        switch (chooce) {
            case 1:
                System.out.println(sumTwoIntegers(n, m));
                break;
            case 2:
                System.out.println(subtractTwoIntegers(n, m));
                break;
            case 3:
                System.out.println(multiplyTwoIntegers(n, m));
                break;
            case 4:
                System.out.println(divideTwoIntegers(n, m));
                break;
            case 5:
                System.out.println(percentageTwoIntegers(n, m));
                break;
            default:
                System.out.println("Illigal Operation");
        }
    }

    //methods
    public static double sumTwoIntegers(int a, int b) {
        double result = a + b;
        return result;
    }

    public static double subtractTwoIntegers(int a, int b) {
        double result = a - b;
        return result;
    }

    public static double multiplyTwoIntegers(int a, int b) {
        double result = a * b;
        return result;
    }

    public static double divideTwoIntegers(int a, int b) {
        double result = a / b;
        return result;
    }

    public static double percentageTwoIntegers(int a, int b) {
        double result = (b / a) * 100;
        return result;
    }

}
