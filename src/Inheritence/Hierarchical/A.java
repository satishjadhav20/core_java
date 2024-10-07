package Inheritence.Hierarchical;

public class A {
    void input(){
        System.out.println("enter your name please :");
    }
}
class B extends  A{
    void  show(){
        System.out.println("my name is satish");
    }
}
class C extends A{
    void display(){
        System.out.println("my name is akanksha");
    }
}
class Test{
    public static void main(String[] args) {
        B b = new B();
        b.input();
        b.show();
        C c = new C();
        c.input();
        c.display();
    }
}
