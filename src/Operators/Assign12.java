package Operators;

import java.util.Scanner;

public class Assign12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int num = sc.nextInt();

        int firstDigit = num / 10000;
        int div = (num / 10);
        int secondLastDigit = div % 10;
        int total = 0;
        total = firstDigit + secondLastDigit;
        System.out.println("number is :"+num);
        System.out.println("total is :"+total);
    }
}
