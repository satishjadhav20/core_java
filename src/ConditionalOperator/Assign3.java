package ConditionalOperator;

import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        if(num % 2 == 0||num % 3 == 0) {
            System.out.println("number is divisible by 2 and 3");
        }
        else{
            System.out.println("number is not divisible by 2 and 3");
        }
    }
}
