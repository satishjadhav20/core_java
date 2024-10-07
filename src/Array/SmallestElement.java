package Array;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int min = array[0];
        for(int i=1;i<=4;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("smallest elements is :"+min);
    }
}
