package Default;

interface A {
    void m1();

    void m2();

    default void m3() {
        System.out.println("default method inside  interface");
    }
}

class P implements A {
    @Override
    public void m1() {
        System.out.println("p class method ");
    }

    @Override
    public void m2() {
        System.out.println("P class  method ");
    }

    @Override
    public void m3() {
        A.super.m3();
        System.out.println("added logic");
    }
}

class Q implements A {
    @Override
    public void m1() {
        System.out.println("Q class method ");
    }

    @Override
    public void m2() {
        System.out.println(" Q class method ");
    }
}

class R implements A {
    @Override
    public void m1() {
        System.out.println("R class method ");
    }

    @Override
    public void m2() {
        System.out.println("R class method ");
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        A a = new P();
        a.m1();
        a.m2();
        a.m3();

        A a1 = new Q();
        a1.m1();
        a1.m2();
        a1.m3();

        A a2 = new R();
        a2.m1();
        a2.m2();
        a2.m3();
    }
}
