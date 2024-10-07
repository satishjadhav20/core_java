package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        int a [] = new int[5];
        int a1 [] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter Second array elements");
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        boolean b=Arrays.equals(a,a1);//equals method
        System.out.println("kay donpan array equal ahet :"+b);
    }
}
