package IfElse;

import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter number 2");
        int num2 = sc1.nextInt();

        if(num > num2){
            System.out.println("number 1 is greater than number 2");
        }
        else{
            System.out.println("number two is greater than number one");
        }
    }
}
