package BreakContinueReturn;

public class Return3 {
    public static String greeting(String name,String name2){
        String greet = "hello"+name+" "+name2+"Bro!";
        return greet;
    }

    public static void main(String[] args) {
        String name = "hello";
        String name2 = "Bro!";
        String message = greeting(name, name2);
        System.out.println(message);
    }
}
