package InputByUser;

import java.util.Scanner;

public class Ab {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();

        Scanner sc1 =new Scanner(System.in);
        System.out.println("enter the value of b");
        int b = sc1.nextInt();

        if(a<50 && a<b){
            System.out.println("both a and b are true");
        }
        else{
            System.out.println("both a and b are false");
        }
    }
}
