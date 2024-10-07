package WhileProgram.java;

import java.util.Scanner;

public class WhilePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int number = 2;

        System.out.println("First " + num + " prime numbers are:");
        while (count < num) {
            boolean isPrime = true;
            int i = 1;
            while (i < num) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.println("forLoop.Prime number: " + num);
                count++;
            }
        }
    }
}