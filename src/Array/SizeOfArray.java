package Array;

import java.util.Scanner;

public class SizeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size of array");
        int size = sc.nextInt();

        int[] array= new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("printed your array");

        for (int i=0; i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
