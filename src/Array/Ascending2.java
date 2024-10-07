package Array;

import java.util.Scanner;

public class Ascending2 {
    public static void main(String[] args) {
        int array[]=new int [5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements in array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Ascending order elements");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
