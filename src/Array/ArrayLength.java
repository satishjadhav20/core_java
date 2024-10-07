package Array;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        int [] a= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array element");

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array element");

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("array length  "+a.length);
    }
}
