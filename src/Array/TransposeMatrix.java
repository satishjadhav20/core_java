package Array;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int transposed[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter element of 2x2 matrix ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposed[j][i] = a[i][j];
            }
        }
        System.out.println("transpose matrix");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
