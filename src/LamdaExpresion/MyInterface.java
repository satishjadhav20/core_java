package LamdaExpresion;

public class MyInterface {
    public static void main(String[] args) {
        interface A{
                void accept(String message);
        }
        A a = (accept)-> System.out.println("Hello i am Satish Namdev Jadhav");
        a.accept("");
    }
}
