package Inheritence.Case3rdObjCreation;
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
class C extends A{
int c;
void m3(){
    System.out.println("C class method ");
}
}
public class ParentChild {
    public static void main(String[] args) {
        A a = new C();
        System.out.println(a.a);
        a.m1();
    }
}
