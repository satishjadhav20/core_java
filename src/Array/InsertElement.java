package Array;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int size;
        int loc;
        int item;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        size=sc.nextInt();

        int array[]=new int[size+1];
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter array location : ");
        loc=sc.nextInt();
        System.out.println("enter new item");
        item=sc.nextInt();

        for(j=size;j>loc;j--){
            array[j]=array[j-1];
        }
        array[loc]=item;
        size++;
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
