package IfElse;

import java.util.Scanner;

public class OldYoungPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first person age");
        int p1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the second person age");
        int p2 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the third person age");
        int p3 = sc2.nextInt();

        if(p1 > p2 && p1 > p3){
            System.out.println("oldest person");
        }
        else if(p2 < p1 && p2 > p3){
            System.out.println("middle age person");
        }
        else if(p3 < p1 && p3 < p2){
            System.out.println("young person");
        }
        else{
            System.out.println("old person");
        }

    }
}
