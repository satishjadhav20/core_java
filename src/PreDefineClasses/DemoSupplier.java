package PreDefineClasses;

public class DemoSupplier {
    public static void main(String[] args) {
        interface Supplier<T>{
            T get();
        }
        Supplier<String> Supplier = () ->"Satish";
        Supplier<Integer>Supplier1=() -> 1000;
        System.out.println(Supplier.get());//string
        System.out.println(Supplier1.get());//integer
    }
}
