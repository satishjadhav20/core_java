package Array;

import java.util.Scanner;

public class BiggestElement {
    public static void main(String[] args) {
        int array [] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<=4;i++){
            array[i]=sc.nextInt();
        }
        int max=array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i]>max){
               max = array[i];
            }
        }
        System.out.println("maximum element"+max);
    }
}
