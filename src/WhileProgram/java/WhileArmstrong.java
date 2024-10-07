package WhileProgram.java;

import java.util.Scanner;
public class WhileArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int OriginalNumber = n;
        int sum = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if(sum == OriginalNumber){
            System.out.println("WhileProgram.java.Armstrong number");
        }
        else{
            System.out.println("Not WhileProgram.java.Armstrong number");
        }
    }
}
