package ConditionalOperator;

import java.util.Scanner;

public class Assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base");
        double base = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a height");
        double height = sc1.nextDouble();

        double area =0;
        area = 0.5*base * height;
        System.out.println("The area is "+area);
    }
}
