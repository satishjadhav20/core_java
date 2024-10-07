package Inheritence.MultiLevelInheritance;

public class A {
    int a,b,c;
    void add(){
        a=10;b=20;
        c=a+b;
        System.out.println("addition of two number is "+c);
    }
    void sub(){
        a=200;b=100;
        c=a-b;
        System.out.println("sub of two number is "+c);
    }
}
class B extends A{
    void mul(){
        a=10;b=20;
        c=a*b;
        System.out.println("multiplication of two number is "+c);
    }
    void div(){
        a=200;b=100;
        c=a/b;
        System.out.println("div of two number is "+c);
    }
}
class C extends B{
    void rem(){
        a=40;b=7;
        c=a%b;
        System.out.println("rem of two number is "+c);
    }

    public static void main(String[] args) {
        C c = new C();
        c.add();
        c.sub();
        c.mul();
        c.div();
        c.rem();
    }
}
