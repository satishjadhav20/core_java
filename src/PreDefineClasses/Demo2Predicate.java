package PreDefineClasses;

public class Demo2Predicate {
        public static void main(String[] args) {
            @FunctionalInterface
            interface Predicate<T>{
                boolean test(T input);
            }
            Predicate<Integer> isEven = number -> number % 2 == 0;
            Predicate<String> StringTest = str ->str.startsWith("A");


            System.out.println("is even test " + isEven.test(10));
            System.out.println("is even test " + isEven.test(11));
            System.out.println(StringTest.test("Akanksha"));
            System.out.println(StringTest.test("Snehal"));
        }
    }


