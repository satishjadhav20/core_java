package Array;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int array[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix:");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
