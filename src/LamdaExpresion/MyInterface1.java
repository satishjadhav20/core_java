package LamdaExpresion;

public class MyInterface1 {
    public static void main(String[] args) {
        interface A{
                String supply();
            }
            A a = () -> "hello from kolhapur !";
        System.out.println(a.supply());
        }
    }

