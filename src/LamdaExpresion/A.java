package LamdaExpresion;
// Anonymous class  way of create subclass of parent  class
public  class A {
    public void m1() {
        System.out.println("parent class method ");
    }

    public static void main(String[] args) {

        A a = new A() {
            @Override
            public void m1() {
                System.out.println("Anonymous  class method ");
            }
        };
        a.m1();
    }
}




