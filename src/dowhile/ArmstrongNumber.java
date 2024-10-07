package dowhile;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int originalNumber = num;
        int sum = 0;
        int rem=0;
        do{
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }while(num > 0);
        System.out.println(sum);
        if(sum == originalNumber){
            System.out.println("WhileProgram.java.Armstrong number");
        }
        else{
            System.out.println("Not WhileProgram.java.Armstrong number");
        }
        System.out.println("rest of your loop...!");
    }
}
