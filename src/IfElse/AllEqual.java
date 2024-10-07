package IfElse;

import java.util.Scanner;

public class AllEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the second number");
        int b = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the third number");
        int c = sc2.nextInt();

        if(a<b && b<c && c<a){
            System.out.println("equal");
        }
        else if(a==b && a==c){
            System.out.println("equal");
        }
        else if (a==c && a==b){
            System.out.println("equal");
        }
        else if(a==c){
            System.out.println("equal");
        }
        else if(a==b){
            System.out.println("equal");
        }
        else if(a==c){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
