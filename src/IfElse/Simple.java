package IfElse;

import java.util.Scanner;
public class Simple {
    public static void main(String[]args){
        int age;
        System.out.println("enter your age...!");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18){
            System.out.println("eligible for votes....!");
        }
        System.out.println("thamk you...!");
    }
}
