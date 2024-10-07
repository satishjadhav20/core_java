package dowhile;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number...!");
        int num = sc.nextInt();
        System.out.println("factors of "+num+"are:");
        int i=1;
        do{
            if(num % i == 0){
                System.out.println(i);
            }
            i++;
        }while(i <= num/2 );
        System.out.println("rest of your loop..!");
    }
}
