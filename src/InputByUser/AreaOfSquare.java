package InputByUser;

import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
        int area=0;
        int parameter=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of square");
        int length = sc.nextInt();

        area = length * length;
        System.out.println("the area of the square is"+area);

        parameter = length/2;
        System.out.println("the parameter of the square is :"+parameter);

    }
}

