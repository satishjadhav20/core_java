package IfElse;

import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quality cost");
        int qualityCost = sc.nextInt();

        if(qualityCost > 1000){
            System.out.println("offer eligible for you and you get 10% discount");
        }
        else{
            System.out.println("not eligible for offer");
        }
    }
}
