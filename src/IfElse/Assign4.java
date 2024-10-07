package IfElse;

import java.util.Scanner;

public class Assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your experience ");
        int year = sc.nextInt();

        if(year > 5){
            System.out.println("your experience is more than 5 years congratulations your eligible 50% for bonus");
        }
        else{
            System.out.println("SORRY ! your experience is less than 5 year so your not eligible for 50% bonus");
        }
    }
}
