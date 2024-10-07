package IfElse;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        int n;
        System.out.println("enter any number...!");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        if(n>=0){
            System.out.println("positive number...!");
        }
        else{
            System.out.println("negative number...!");
        }
    }
}
