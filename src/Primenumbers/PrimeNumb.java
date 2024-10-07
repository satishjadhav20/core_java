package Primenumbers;

public class PrimeNumb {
    public static void main(String[] args) {

        int num = 50;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num/2; j++) {
                if (i % j == 0) {
                    System.out.println(j + " ");
                }
            }
            System.out.println();
        }
    }
}


