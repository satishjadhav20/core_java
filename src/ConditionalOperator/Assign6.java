package ConditionalOperator;

import java.util.Scanner;

public class Assign6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = sc.nextDouble();

        double absValue = Math.abs(num);
        System.out.println("The absolute value of " + num + " is " + absValue);
    }
}
