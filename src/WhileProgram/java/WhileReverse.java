package WhileProgram.java;

import java.util.Scanner;

public class WhileReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reverse=0;
        int temp = 0;
        while(num >0) {
            temp = num % 10;
            reverse = reverse * 10 + temp;
            num = num / 10;

        }
        System.out.println("the reversed number is: " + reverse);
    }
}
