package IfElse;

import java.util.Scanner;
public class PN0 {
    public static void main(String[]args){
        int n;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n> 0){
            System.out.println("number is positive");
        }
        else if(n<0){
            System.out.println("number is negative");
        }
        else if (n==0) {
            System.out.println("number is universel zero");
        }
        else{
            System.out.println("invalid charactor");
        }
    }
}
