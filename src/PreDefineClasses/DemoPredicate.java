package PreDefineClasses;

public class DemoPredicate {
    public static void main(String[] args) {
        interface Predicate{
            boolean test(int number);
        }
        Predicate isEven = number -> number % 2 == 0;

        System.out.println("is even test " + isEven.test(10));
        System.out.println("is even test " + isEven.test(11));
    }
}
