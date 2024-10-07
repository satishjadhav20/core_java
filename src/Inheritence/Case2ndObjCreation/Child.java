package Inheritence.Case2ndObjCreation;
class A{
    int a;
    void m1(){
        System.out.println("A class method");
    }
}
class B extends  A{
    int b;
    void m2(){
        System.out.println("B class method");
    }
}
class C extends  B{
    int c;
    void m3(){
        System.out.println("C class method");
    }
}
public class Child {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a=100);
        System.out.println(c.b=200);
        System.out.println(c.c=300);
        c.m1();
        c.m2();
        c.m3();
    }
}
