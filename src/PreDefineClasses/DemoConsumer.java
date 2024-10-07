package PreDefineClasses;
import java.util.function.Consumer;
public class DemoConsumer {
    public static void main(String[] args) {
        interface Consumer<T>{
            void accept(T t);
        }
        Consumer<String> stringConsumer = t -> System.out.println("you have entered " + t);
        Consumer<Integer> integerConsumer = t -> System.out.println("you have entered " + t);
        stringConsumer.accept("good morning");
        integerConsumer.accept(100);
    }
}
