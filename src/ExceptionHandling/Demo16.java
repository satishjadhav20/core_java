package ExceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10/0);
            }
            finally {
                System.out.println("finally block");
            }
            System.out.println("abc");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("invalid denominator");
        }
    }
}
