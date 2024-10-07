package ConditionalOperator;

import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int num1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a 2nd number");
        int num2 = sc1.nextInt();

        if(num1>num2){
            System.out.println(num1+" is greater than ");
        }
        else{
            System.out.println(num2+" is less than ");
        }
    }
}
