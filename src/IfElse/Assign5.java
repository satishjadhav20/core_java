package IfElse;

import java.util.Scanner;

public class Assign5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your percentage");
        int per =sc.nextInt();

        if(per > 80 && per < 100){
            System.out.println("Congratulation your distinction ");
        }
        else if(per > 70 && per<80){
            System.out.println("Congratulation your grade is 1st class");
        }
        else if (per > 55 && per < 70){
            System.out.println("Congratulation your grade is second class");
        }
        else if (per > 35 && per < 55){
            System.out.println("Congratulation your pass !");
        }
        else{
            System.out.println("SORRY ! yor fail");
        }
    }
}
