package InputByUser;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1 : ");
        int n = sc.nextInt();
        sum = sum +n;
        System.out.println("sum is "+sum);
        if (sum%2==0){
            System.out.println("sum of  even numbers is"+sum);
        }
        else{
            System.out.println("sum of not even numbers");
        }
    }
}
