package Operators;

import java.util.Scanner;

public class Assign14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num = sc.nextInt();

        int num1 =num /100;
        int num2 = (num/10) % 10;
        int num3 = (num%10);

        int newNumber = num1 + num2  + num3;
        System.out.println("original number is: " + num);
        System.out.println("sum of digit is :"+newNumber);
    }
}
