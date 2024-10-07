package Inheritence.ParentChildCIS;
class  A {
    static {
        System.out.println("A class static method ");
    }

    {
        System.out.println("A class instance method ");
    }

    A(){
        System.out.println("A constructor");
    }
}
class B extends A{
    static {
        System.out.println("B class static method ");
    }

    {
        System.out.println("B class instance method ");
    }

    B(){
        System.out.println("B constructor");
    }
}
class C extends B{
    static {
        System.out.println("C class static method ");
    }

    {
        System.out.println("C class instance method ");
    }

    C(){
        System.out.println("C constructor");
    }
}
public class Demo {
    public static void main(String[] args) {
        C c = new C();

    }
}
