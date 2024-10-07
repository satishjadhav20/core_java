package Inheritence.Case1stobjcreation;
class A{
    int a;
    void m1(){
        System.out.println("parent class method");
    }
}
class B extends A{
    int b = 200;
    void m2(){
        System.out.println("child class method");
    }
}
public class Parent {
    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1.a=100);
        a1.m1();
    }
}
