package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data in array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);//sort method
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
