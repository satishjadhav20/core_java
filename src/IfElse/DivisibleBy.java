package IfElse;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number a");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter a number b");
        int b = sc1.nextInt();

        if(a % 2 == 0){
            System.out.println("divisible number by 2 ");
        }
        else if (b % 3 == 0){
            System.out.println("number is divisible by 3");
        }
        else{
            System.out.println("number is not divisible by 2 and 3");
        }
    }
}
