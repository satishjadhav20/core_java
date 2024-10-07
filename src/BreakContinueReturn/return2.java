package BreakContinueReturn;

import java.util.Scanner;

public class return2 {
    public static boolean isEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your value");
        int a = sc.nextInt();
        if (a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result = isEven();
        System.out.println("Is the number even? " + result);
    }
}