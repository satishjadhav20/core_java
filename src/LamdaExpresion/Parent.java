package LamdaExpresion;

abstract  class Parent {
    abstract void m1();
}
 class Test {
    public static void main(String[] args) {
        Parent p = new Parent() {
            @Override
            void m1() {
                System.out.println("Anonymous abstract method ");
            }
        };
        p.m1();
    }
}
