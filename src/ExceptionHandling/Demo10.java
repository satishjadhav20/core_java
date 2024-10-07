package ExceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try{
            System.out.println(10/1);
            String str = null;
            System.out.println(str.length());
            int array []={};
            System.out.println(array[0]);
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
