package IfElse;

import java.util.Scanner;
public class NestedU {
    public static void main(String[]args){
        int a,b,c;
        System.out.println("enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();

        System.out.println("enter the value of b: ");
        Scanner sc1 = new Scanner(System.in);
        b=sc1.nextInt();

        System.out.println("enter the value of c: ");
        Scanner sc2 = new Scanner(System.in);
        c=sc2.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greater than c: "+a);
            }
            else{
                System.out.println("c is greater than a: "+c);
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater c: "+b);
            }
            else{
                System.out.println("c is greater than b: "+c);
            }
        }
    }
}
