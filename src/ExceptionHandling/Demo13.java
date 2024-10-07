package ExceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        try{
            System.out.println(10/1);
            String str = null;
            System.out.println(str.length());
            int array []={};
            System.out.println(array[0]);
            System.out.println("*****");
        }
       catch (Exception e){
           System.out.println("generic exception");
       }
        finally {
            System.out.println("finaly block");
        }
        System.out.println("rest of main method");
    }
}
