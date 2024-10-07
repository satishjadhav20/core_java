package dowhile;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number...");
        int num = sc.nextInt();
        int i =1;
        int sum = 0;
        do{
            if(num % i == 0){
                sum = sum + i;
                System.out.println(sum);
            }
            i++;
        }while(num > 0);
        System.out.println(num);
        if(sum == num){
            System.out.println("number is perfect");
        }
        else{
            System.out.println("number is odd");
        }
        System.out.println("Rest of your code.....");
    }
}
