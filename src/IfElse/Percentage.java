package IfElse;

import java.util.Scanner;
public class Percentage {
    public static void main(String[]args){
        int per=0;
        System.out.println("Enter your percentage and check your rank");
        Scanner sc=new Scanner(System.in);
        per=sc.nextInt();
        if(per>=90 && per<=100){
            System.out.println("congratulations your rank is distinction");
        }
        else if(per>=75 && per<=90){
            System.out.println("your rank is first class");
        }
        else if(per>=55 && per<=75){
            System.out.println("your rank is second class");
        }
        else if(per>35 && per<=55){
            System.out.println("your pass...!");
        }
        else{
            System.out.println("SORRY your fail better luck next time");
        }
    }
}
