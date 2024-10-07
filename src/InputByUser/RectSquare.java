package InputByUser;

import java.util.Scanner;
public class RectSquare {
    public static void main(String[] args) {
        int area=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        int length = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the breadth of rectangle");
        int breadth = sc1.nextInt();

        area = length * breadth;
        System.out.println("area is :"+area);

        if(length == breadth){
            System.out.println("it is a square");
        }
        else{
            System.out.println("it is not a square");
        }
    }
}
