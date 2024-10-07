package ExceptionHandling;

public class Demo15 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10/0);
            }
            catch (ArithmeticException arithmeticException){
                System.out.println("invalid denominator");
            }
            System.out.println("abc");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("invalid denominator");
        }

    }
}
