package LamdaExpresion;
interface D{
    void str(String a, String b,String c);
}
public class DemoConcat {
    public static void main(String[] args) {
        D d =(a,b,c) -> System.out.println(a+b+c);
        d.str("Happy"," ","Birthday");
    }
}
