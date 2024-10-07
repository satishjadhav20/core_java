package LamdaExpresion;
@FunctionalInterface
interface C1 {
    abstract void m1();
}
class MainClass {
    public static void main(String[] args) {
        // Using lambda expression to implement the abstract method m1
        C1 c1 = () -> System.out.println("Lambda expression way");

        // Calling the method m1 to see the result
        c1.m1();
    }
}
