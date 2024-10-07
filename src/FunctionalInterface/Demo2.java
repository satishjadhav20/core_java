package FunctionalInterface;
@FunctionalInterface
interface Summer<T>{
 T sum(T a,T b);
}
 public class Demo2 {
  public static void main(String[] args) {
   Summer<Integer> integerSummer =(a,b) -> a + b ;
   System.out.println("sum of integer " +integerSummer.sum(10,20));

   Summer<Double> doubleSummer =(a,b) -> a + b ;
   System.out.println("sum of integer " +doubleSummer.sum( 10.5,20.5));

   Summer<Long> longSummer =(a,b) -> a + b ;
   System.out.println("sum of integer " +longSummer.sum( 1000000000L,20000000L));
   }
  }

