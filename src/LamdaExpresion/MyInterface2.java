package LamdaExpresion;

public class MyInterface2 {
    public static void main(String[] args) {
        interface A{
                void display();
        }
        A a = () -> System.out.println("I am From Vadgav ");
        a.display();
    }
}
