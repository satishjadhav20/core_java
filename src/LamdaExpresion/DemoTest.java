package LamdaExpresion;

interface S{
    String str();
}
public class DemoTest {
    public static void main(String[] args) {
        S s = () -> "Akanksha";
        System.out.println(s.str());
        String result = s.str();

        if (result != null && !result.isEmpty()) {
            System.out.println(result.charAt(0));
        }
        else {
            System.out.println(" string is empty or null.");
        }

    }
}
