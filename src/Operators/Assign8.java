package Operators;

public class Assign8 {
    public static void main(String[] args) {
        int a=6;
        int b = 8;
        int temp;
        System.out.println("before swapping ");
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);

        temp=a;
        a=b;
        temp=b;

        System.out.println("after swapping");
        System.out.println("a is :"+a);
        System.out.println("b is "+b);

        System.out.println("without using third variable.......!");

        System.out.println("before swapping ");
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swapping");
        System.out.println("a is :"+a);
        System.out.println("b is "+b);
    }
}
