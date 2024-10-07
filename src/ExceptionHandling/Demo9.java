package ExceptionHandling;

public class Demo9 {
    public static void main(String[] args) {
        try{
            System.out.println(10/1);
            System.out.println("*****");
        }
        catch (ArithmeticException arithmeticException ){
            System.out.println("invalid denominator");
        }
        finally {
            System.out.println("finaly block");
        }
        System.out.println("rest of main method");
    }
}
