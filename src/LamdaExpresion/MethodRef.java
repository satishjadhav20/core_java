package LamdaExpresion;

public class MethodRef {
    public static void main(String[] args) {
        interface A{
            void m1();
        }
        class B implements A{
            @Override
           public void m1(){
                System.out.println("traditional way method");
            }
        }
    }
}
