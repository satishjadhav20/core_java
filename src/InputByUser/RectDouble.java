package InputByUser;

import java.util.Scanner;

public class RectDouble {
    public static void main(String[] args) {
        double area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        double length = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the breadth of rectangle");
        double breadth = sc1.nextDouble();

        area = length * breadth;
        int intArea = (int) area;
        System.out.println("area of rectangle is (as an integer)is :"+intArea);

    }
}
