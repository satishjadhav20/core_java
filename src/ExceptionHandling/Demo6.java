package ExceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        finally {
            System.out.println("finaly block");
        }
        System.out.println("rest of main method");
    }
}
