package Operators;

import java.util.Scanner;

public class Assign15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num = sc.nextInt();

        int num1 = num % 10;
        int num2 = (num /10)%10;
        int sum3 = num / 100;

        int newNumber=num1 * 100 + num2 * 10 + sum3;
        System.out.println("original number is :"+num);
        System.out.println("new number is :"+newNumber);
    }
}
