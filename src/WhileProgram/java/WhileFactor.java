package WhileProgram.java;

import java.util.Scanner;
public class WhileFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + " are:");
        int i = 1;
        while (i <= num / 2) {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
