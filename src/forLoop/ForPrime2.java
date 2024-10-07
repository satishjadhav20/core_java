package forLoop;

public class ForPrime2 {
    public static void main(String[] args) {

        int n = 10;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                System.out.println(i);
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
