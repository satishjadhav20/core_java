package WhileProgram.java;

import java.util.Scanner;

public class WhileFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int number = 1;
        int fact = 1;
        while(number<=n){
            fact = fact * number;
            number++;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
