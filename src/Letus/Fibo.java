package Letus;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();

        printFibonacci(num);

    }

    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("The number of terms must be positive.");
            return;
        }
        int a = 0, b = 1;
//        System.out.print( n );

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
}

