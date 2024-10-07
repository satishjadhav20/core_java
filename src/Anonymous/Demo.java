package Anonymous;

class Demo {
    void m1() {

    }

    public static void main(String[] args) {

        Demo demo = new Demo() {
            void m1() {
                System.out.println("Anonymous class m1 method ");
            }
        };
        demo.m1();
    }
}