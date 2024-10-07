package IfElse;

import java.util.Scanner;

public class Assign10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter your gender  ");
        String gender = sc1.nextLine();

        if(gender.equals("female")){
            System.out.println("work only urban areas ");
        }
        else if (gender.equals("male") && age > 20 && age<=49){
            System.out.println("may work any where");
        }
        else if(gender.equals("male") && age > 40 && age < 60){
            System.out.println("work in urban areas only");
        }
        else if (age < 20 || age > 60){
            System.out.println("ERROR");
        }
        else{
            System.out.println("invalid condition ");
        }
    }
}
