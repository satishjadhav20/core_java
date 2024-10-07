package ObjectClass;

public class DemoGetClassMethod {
    public static void main(String[] args) {
        class GetClass {
            int a;
            int b;
            int c;

            GetClass() {}

            void m1(){}

            static void m2() {}
        }
        GetClass getClass = new GetClass();
        Class<?>reference = getClass.getClass();

        System.out.println(reference.getName());
    }
}
