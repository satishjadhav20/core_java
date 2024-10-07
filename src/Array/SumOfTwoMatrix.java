package Array;

import java.util.Scanner;

public class SumOfTwoMatrix {
    public static void main(String[] args) {
        int array1[][] = new int[2][2];
        int array2[][] = new int[2][2];
        int array3[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first matrix data");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                array1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter second matrix data");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                array2[i][j]=sc.nextInt();
            }
        }

        System.out.println("print first matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(array1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("print second matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(array2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("sum of two matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                array3[i][j]=array1[i][j] + array2[i][j];
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
