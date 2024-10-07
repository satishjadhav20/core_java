package dowhile;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number...");
        int num=sc.nextInt();

        int originalNumber = num;
        int reversedNumber = 0;
        int temp;
        do{
            temp = num % 10;
            reversedNumber=reversedNumber * 10 + temp;
            num = num / 10;
        }while(num > 0);
        System.out.println(reversedNumber);
        if(originalNumber == reversedNumber){
            System.out.println("palindrome number...!");
        }
        else{
            System.out.println("not palindrome number...!");
        }
    }
}
