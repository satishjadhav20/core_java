package InputByUser;

import java.util.Scanner;

public class SumOf_n_Numbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n= sc.nextInt();

        for(int i=1;i<n;i++){
            System.out.println("enter the number "+i+" ");
            int num = sc.nextInt();
            sum = sum+n;
        }
        System.out.println(sum);
    }
}
