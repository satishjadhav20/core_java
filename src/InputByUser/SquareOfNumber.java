package InputByUser;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        int sqr=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        sqr=n*n;
        System.out.println("the square of number is :"+sqr);

    }
}
