package IfElse;

public class Nested {
    public static void main(String[]args){
        int a=50,b=30,c=20;
        if(a>b){
            if(a>c){
                System.out.println("a is greater than c"+a);
            }
            else{
                System.out.println("c is greater than a"+c);
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater c"+b);
            }
            else{
                System.out.println("c is greater than b"+c);
            }
        }
    }
}
