package Operators;

public class SwappingNum {
    public static void main(String[] args) {
        int a= 6;
        int b = 8;
        int temp;
        System.out.println("before swapping");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        temp = a;
        a=b;
        b= temp;
        System.out.println("after swapping ");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
