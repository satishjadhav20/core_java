package ExceptionHandling;

public class Demo19{
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("invalid denominator");
        }
    }

    private static int divide(int num1, int num2)  {
        int division = num1 / num2;
        return  division;
    }
}
