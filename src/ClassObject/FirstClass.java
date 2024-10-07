package ClassObject;

public class FirstClass {
    int a = 10;
    String b = "sattu";

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }
    public static void main(String[] args) {
      FirstClass fc = new FirstClass();
      fc.getA();
      fc.getB();
    }
}
