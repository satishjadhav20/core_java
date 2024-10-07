package Array;

import java.util.Scanner;

public class MinorMatrix {
    public static void main(String[] args) {
        int a[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 2x2 matrix ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
              a[i][j]=sc.nextInt();
            }
        }
    }
}
