package LamdaExpresion;

interface A1 {
    int add(int a, int b);
}
class MyTest{
    public static void main(String[] args) {
        A1 a1=(a,b) -> a+b;
        int result = a1.add(4,5);
        System.out.println(result);
    }
}
