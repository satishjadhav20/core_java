package WhileProgram.java;

import java.util.Scanner;
public class WhilePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNumber = num;
            int reverseNumber = 0;
            int temp ;
            while (num > 0) {
                temp = num % 10;
                reverseNumber = reverseNumber * 10 + temp;
                num = num / 10;
            }
            if (reverseNumber == originalNumber) {
                System.out.println("It is a palindrome.");
            }
            else {
                System.out.println("It is not a palindrome.");
            }
        }
    }

