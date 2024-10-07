package Polymorphism;
class A{
    void m1(){
        System.out.println("class A method ");
    }
}
class B extends  A{
    @Override
    void m1(){
        System.out.println("b class method ");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}
