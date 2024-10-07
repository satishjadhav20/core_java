package Default;


interface I {
    default void m1(){
        System.out.println("A interface default method ");
    }
}
interface  B{
    default void m1(){
        System.out.println("B interface Default method");
    }
}
class C implements I,B{
    @Override
    public void m1(){
        I.super.m1();
        B.super.m1();
    }
}
public class DemoDefaultUseMulInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}
