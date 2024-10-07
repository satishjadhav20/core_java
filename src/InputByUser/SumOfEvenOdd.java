package InputByUser;

import java.util.Scanner;
public class SumOfEvenOdd {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the number");
        int n1=sc1.nextInt();

        sum=n+n1;
        System.out.println("sum of two numbers is :"+sum);

       if(sum % 2 == 0){
           System.out.println("the sum is even ");
       }
       else{
           System.out.println("sum is odd");
       }
    }
}
