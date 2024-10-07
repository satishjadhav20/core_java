package forLoop;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter second number");
        int num2 = sc1.nextInt();

        int gcd =1;
        for(int i=1;i<=Math.min(num1,num2);i++){
            if(num1 % i == 0 && num2 % 2 == 0){
                gcd = i;
            }
        }
        System.out.println("gcd is "+gcd);
    }
}
