package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOf {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int a1[]= Arrays.copyOf(a,5);
        System.out.println("data in array 2");
        for(int i=0;i<a.length;i++){
            System.out.println(a1[i]+" ");
        }
    }
}
